package com.company;

import java.util.ArrayList;

public class Main {
    public static final ArrayList<Alumno> alumnos= new ArrayList<>();
    public static void main(String[] args) {
        Profesor prof=new Profesor();
        prof.start();
    }
    public synchronized static void desinfeccion(int cont){
        try {
            Thread.sleep(5000);
            int tinicial=Main.alumnos.size();
            System.out.println("======Empiezo la primera desinfeccion======");


            for(int j=0;j<cont;j++){
                System.out.println("El profesor empieza a desinfectar a "+alumnos.get(j).getName());
                Thread.sleep(1000);
                System.out.println(alumnos.get(j).getName()+" desinfectado");
            }
            Thread.sleep(31000);
            System.out.println("======Empiezo la segunda desinfeccion======");
            for(int y=cont;y<Main.alumnos.size();y++){
                System.out.println("El profesor empieza a desinfectar a "+alumnos.get(y).getName());
                Thread.sleep(1000);
                System.out.println(alumnos.get(y).getName()+" desinfectado");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }






    }
}
