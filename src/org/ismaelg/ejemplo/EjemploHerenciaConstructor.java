package org.ismaelg.ejemplo;

import org.ismaelg.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("========== Creando instancia de la clase alumno ========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Garcia");
        alumno.setNombreColegio("Itla");
        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.8);

        System.out.println("========== Creando instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setNombreColegio("Itla");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("========== Creando instancia de la clase Profesor ========");
        Profesor profesor = new Profesor();
        profesor.setNombre("David");
        profesor.setApellido("Queliz");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getNombreColegio()
                + " " +alumno.getApellido());
        System.out.println(alumnoInt.getNombre()
                           + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getNombreColegio()
                + " " + alumnoInt.getPais()
        );
        System.out.println("Profesor " + profesor.getAsignatura()
                            + ": " + profesor.getNombre()
                            + " " + profesor.getApellido());


        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de las clases padre " +padre);
            clase = clase.getSuperclass();
        }
    }
}
