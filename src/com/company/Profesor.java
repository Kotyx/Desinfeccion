package com.company;

public class Profesor extends Thread{

    public void run(){
            //try {
                synchronized (Main.alumnos){
                    int cont=0;
                    for(int i=0;i<10;i++){
                        Alumno al = new Alumno();
                        al.setName("Alumno "+i);
                        al.start();


                        //Main.alumnos.wait();
                        cont= al.cont+cont;
                        Main.alumnos.add(al);
                        Main.alumnos.notify();


                    }
                    Main.desinfeccion(cont);
                    Main.alumnos.notify();
                    for(Alumno al1:Main.alumnos){
                        try {
                            al1.join();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //Main.alumnos.wait();



                }
            //} catch (InterruptedException e) {
                //e.printStackTrace();
            //}

    }

}
