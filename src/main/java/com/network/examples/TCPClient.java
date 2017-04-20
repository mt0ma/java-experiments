package com.network.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 9999);

            BufferedReader receivedInfo = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Got response from server: " + receivedInfo.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
