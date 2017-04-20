package com.network.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPServer {

    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(9999);

            while (true) { // pur si simplu asteapta
                System.out.println("Waiting...");
                Socket newClientConnection = server.accept();
                try {
                    PrintWriter output = new PrintWriter(newClientConnection.getOutputStream(), true);
                    System.out.println("New client connected, sending date");
                    output.println("now: " + new Date());
                } finally {
                    newClientConnection.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
