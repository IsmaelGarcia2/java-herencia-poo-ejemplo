package org.ismaelg.ejemplo;

import org.ismaelg.pooherencia.Alumno;
import org.ismaelg.pooherencia.AlumnoInternacional;
import org.ismaelg.pooherencia.Persona;
import org.ismaelg.pooherencia.Profesor;

public class EjemploHerenciaConstructor {
    public static void main(String[] args) {

        System.out.println("========== Creando instancia de la clase alumno ========");
        Alumno alumno = new Alumno("Ismael","Garcia", 14, "Itla");
        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.8);
        alumno.setEmail("ismael@correo.com");

        System.out.println("========== Creando instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia" );
        alumnoInt.setEdad(15);
        alumnoInt.setNombreColegio("Itla");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("Peter@correo.com");


        System.out.println("========== Creando instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("David", "Queliz", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("David@correo.com");

        System.out.println("====== - =======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir (Persona persona){
        System.out.println("Imprimiendo datos en comun de tipo Persona");
        System.out.println("Nombre: " + persona.getNombre()
                        + ", Apellido: " +persona.getApellido()
                + ", Edad:  " + persona.getEdad()+
                ", Emails: " + persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo datos del tipo alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getNombreColegio());
            System.out.println("Notas Matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Notas Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Notas Lenguas: " + ((Alumno) persona).getNotaLengua());


            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: "+ ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============Escritura promedio==============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("============Escritura promedio==============");

        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("============Escritura saludar==============");

        System.out.println(persona.saludar());
        System.out.println("==========================");

    }
}
