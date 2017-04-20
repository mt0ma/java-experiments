package com.network.examples;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.net.InetAddress;

public class SNMPWithSnmp4j {

    public static void main(String[] args) {
        // SNMP object and listen all connections for the response
        Snmp snmp = null;
        try {

            // 1. SNMPv1/v2c GETNEXT PDU
            PDU requestPDU = new PDU();
            requestPDU.add(new VariableBinding(new OID("1.3.6.1.2.1.1.1"))); // sysDescr
            requestPDU.add(new VariableBinding(new OID("1.3.6.1.2.1.1.3"))); // sysuptime
            requestPDU.setType(PDU.GETNEXT);

            // 2. Community Target
            Address targetAddress = new UdpAddress(InetAddress.getByName("127.0.0.1"), 161);
            CommunityTarget target = new CommunityTarget();
            target.setCommunity(new OctetString("public"));
            target.setAddress(targetAddress);
            target.setVersion(SnmpConstants.version1);

            // 3. Create the SNMP instance and listen the responses
            snmp = new Snmp(new DefaultUdpTransportMapping());
            snmp.listen();

            ResponseEvent response = snmp.send(requestPDU, target);
            if (response.getResponse() == null) {
                // request timed out
            } else {
                System.out.println("Received response from: " +
                        response.getPeerAddress());
                // dump response PDU
                System.out.println(response.getResponse().toString());
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
