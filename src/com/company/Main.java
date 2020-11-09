package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Profesor prof=new Profesor();
        prof.start();

        for(int i=0;i<10;i++){
            Alumno al = new Alumno();
            al.setName("Alumno "+i);
            al.start();


            //Main.alumnos.wait();

        }


    }
    //public synchronized static void desinfeccionAlumno(Alumno alumno){
        //try {
            //alumno.wait();
           // System.out.println("El profesor empieza a desinfectar a "+alumno.getName());
            //Thread.sleep(1000);
            //System.out.println(alumno.getName()+" desinfectado");
        //} catch (InterruptedException e) {
            //e.printStackTrace();
        //}
    //}
}
