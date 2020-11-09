package com.company;

import java.util.ArrayList;

public class Profesor extends Thread{

    public synchronized void run(){
            try {

                sleep(5000);
                System.out.println("======Empiezo la primera desinfeccion======");
                notifyAll();


                sleep(31000);
                System.out.println("======Empiezo la segunda desinfeccion======");
                notifyAll();





            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }



}
