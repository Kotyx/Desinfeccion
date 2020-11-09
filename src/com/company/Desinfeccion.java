package com.company;

public class Desinfeccion{
    public synchronized static void desinfeccionAlumno(Alumno alumno){
        try {
            alumno.wait();
            System.out.println("El profesor empieza a desinfectar a "+alumno.getName());
            Thread.sleep(1000);
            System.out.println(alumno.getName()+" desinfectado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
