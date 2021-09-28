package com.duoc.clases;

import java.text.DecimalFormat;

public class Cliente {
    
    //Atributos
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private int sueldo;
    private TarjetaCredito tc;

    //Constructores
    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellido, int edad, int sueldo, TarjetaCredito tc) {
        this.rut = rut;
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSueldo(sueldo);
        this.tc = tc;
    }
    
    //Getters & Setters (accesadores y mutadores)

    public String getRut() {
        return rut;
    }

    /**
     * Validar que el Rut sea válido. (tarea para la casa)
     * @param rut String
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Validar que el nombre tenga entre 2 a 30 caracteres
     * @param nombre 
     */
    public void setNombre(String nombre) {
        if(nombre.length() >= 2 && nombre.length() <= 30)
        {
            this.nombre = nombre;
        }
        else
        {
            System.out.println("Debes ingresar un nombre que contenga al menos de 2 a 30 caracteres.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    /**
     * Validar que el apellido tenga entre 2 a 30 caracteres
     * @param apellido String
     */
    public void setApellido(String apellido) {
        if(apellido.length() >= 2 && apellido.length() <= 30)
        {
            this.apellido = apellido;
        }
        else
        {
            System.out.println("Debes ingresar un apellido que contenga al menos de 2 a 30 caracteres.");
        }
    }

    public int getEdad() {
        return edad;
    }

    /**
     * Validar que el edad este entre los 18 y 90 años
     * @param edad int 
     */
    public void setEdad(int edad) {
        if(edad >= 18 && edad <= 90)
        {
            this.edad = edad;
        }
        else
        {
            System.out.println("No cumples con los requisitos etarios para poder obtener una tarjeta de crédito.");
        }
    }

    public int getSueldo() {
        return sueldo;
    }

    /**
     * Validar que el sueldo sea mayor o igual a 450.000 pesos
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        if(sueldo >= 450000)
        {
            this.sueldo = sueldo;
        }
        else
        {
            System.out.println("Debes acreditar un sueldo mayor o igual a $ 450.000 pesos.");
        }
    }

    public TarjetaCredito getTc() {
        return tc;
    }

    public void setTc(TarjetaCredito tc) {
        this.tc = tc;
    }
    
    
    //Método CUSTOM
    public String informacionCliente(){
        DecimalFormat formatoSueldo = new DecimalFormat("$ ###,###");
        String info = 
                "Rut: " + rut + "\n" + 
                "Nombre: " + nombre + " " + apellido + "\n" + 
                "Edad: " + edad + " años" + "\n" + 
                "Sueldo: " + formatoSueldo.format(sueldo) + "\n" + 
                tc.informacionTarjeta();
        return info;
    }
    
    
    
    
    
    
}
