package com.company;

import java.util.Random;

public class Alumno extends Thread{

    static int contAlumnosHora=0;

    @Override
    public synchronized void run() {
        try {
                int sleepingTime;
                Random r = new Random();
                boolean llegaTarde = r.nextBoolean();

                if (!llegaTarde) {
                    sleepingTime = r.nextInt(4000);
                    Alumno.contAlumnosHora++;

                } else {
                    sleepingTime = r.nextInt(20000) + 5000;
                }

                sleep(sleepingTime);

                System.out.println("Ha llegado " + getName());
                System.out.println(getName()+" espera que el profesor le desinfecte");
                Desinfeccion.desinfeccionAlumno(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
