package com.ghailene;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try (ServerSocket serverSocket = new ServerSocket(5000)) {


            while (true) {
              /*  Socket socket = serverSocket.accept();
                Echoer echoer = new Echoer(socket);
                echoer.start();*/
                /* we  used threads to allow multiple client connexion **/

                /** or too court WITH ONE LINE **/
           new Echoer(serverSocket.accept()).start();
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
            e.printStackTrace();
        }


    }
}
