package com.company;

import java.util.Random;

public class Alumno extends Thread{

    static int cont=0;

    @Override
    public void run() {
        try {
                int cuenta=0;
                int sleepingTime=0;
                Random r = new Random();
                boolean llegaTarde = r.nextBoolean();

                if (!llegaTarde) {
                    sleepingTime = r.nextInt(4000);
                    Alumno.cont=cuenta+1;
                } else {
                    sleepingTime = r.nextInt(20000) + 5000;
                }

                sleep(sleepingTime);

                System.out.println("Ha llegado " + getName());
                System.out.println(getName()+" espera que el profesor le desinfecte");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
