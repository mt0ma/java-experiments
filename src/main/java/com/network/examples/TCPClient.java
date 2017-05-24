package com.network.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.Arrays;

public class TCPClient {

    public static void main(String[] args) {
        try {
            /*Socket clientSocket = new Socket("127.0.0.1", 9999);

            BufferedReader receivedInfo = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Got response from server: " + receivedInfo.readLine());*/

            int[] array = {1,2,3,4,5,6,7,8,9};
            int[] newArray = Arrays.copyOfRange(array, 3,array.length);

            for(int i=0; i<newArray.length; i++) {
                System.out.println(newArray[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
