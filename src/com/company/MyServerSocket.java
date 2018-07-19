package com.company;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.UnknownHostException;

// There is I created a connect with socket;
public class MyServerSocket {
    public static void main(String[] args) throws Exception{
        Socket socket = null;
        int port = 8080;
        try{
            ServerSocket server = new ServerSocket(port);
            socket = server.accept() ;
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("привет!");
            ps.flush();
            server.close();
        } catch (IOException e){
            System.out.println("Error" + e);

        }

    }
}
class MyClientSocket{
    public static void main(String[] args) throws UnknownHostException {
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.8", 8080 );
            BufferedReader dis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = dis.readLine();
            System.out.println(msg);
        } catch (IOException e){
            System.out.println("Error: " + e);
        }

    }
}
