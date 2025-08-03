package org.ismaelg.pooherencia;

public class Alumno extends Persona {
    private String nombreColegio;
    private double notaMatematica;
    private double notaLengua;
    private double notaHistoria;


    public Alumno(){
        super();
        System.out.println("Alumno: inicializando constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio){
        super(nombre, apellido, edad);
        this.nombreColegio = nombreColegio;
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio,
    double notaMatematica, double notaLengua, double notaHistoria){
        this(nombre, apellido, edad, nombreColegio);
        this.notaMatematica = notaMatematica;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;

    }


    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar  + ", soy alumno y mi nombre es: "+ getNombre();
    }

    public double calcularPromedio(){
       // System.out.println("Calcular promedio" + Alumno.class.getCanonicalName());
        return (notaHistoria + notaLengua + notaMatematica)/ 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n nombreColegio='" + nombreColegio + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaLengua=" + notaLengua +
                ", notaHistoria=" + notaHistoria+
                ", Promedio=" + this.calcularPromedio();
    }
}
