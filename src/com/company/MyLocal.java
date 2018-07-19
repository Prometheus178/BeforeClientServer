package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;
//There is I was trying to research java.net library;
class MyLocal {
    public static void main(String[] args) {
        InetAddress myIP = null;
        try{
            myIP = InetAddress.getLocalHost();
        } catch (UnknownHostException e){
            System.out.println("Ошибка доступа" + e);
        }
        System.out.println("Мой IP "+ myIP);


        InetAddress domenIP = null;
        try {
            domenIP = InetAddress.getByName("google.com");
        } catch (UnknownHostException e){
            System.out.println("Ошибка доступа" + e);
        }
        System.out.println("Domen IP "+ domenIP);

    }
}