package com.duoc.clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Piloto {
    
    //ATRIBUTOS
    private String nombre;
    private String equipo;
    private String pais;
    private String fecha_nacimiento;
    private String categoria;
    private int carreras_completadas = 0;
    private int puntaje = 0;
    private Vehiculo vehiculo;
    
    //CONSTRUCTORES
    public Piloto() {
    }

    public Piloto(String nombre, String equipo, String pais, String fecha_nacimiento, String categoria, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais = pais;
        this.fecha_nacimiento = fecha_nacimiento;
        this.categoria = categoria;
        this.vehiculo = vehiculo;
    }
    
    //ACCESADORES y MUTADORES

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCarreras_completadas() {
        return carreras_completadas;
    }

    private void setCarreras_completadas(int carreras_completadas) {
        this.carreras_completadas = carreras_completadas;
    }

    public int getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    //METODOS CUSTOM
    public void ingresarDatosCarrera(int posicion, double kms_recorridos){
        carreras_completadas++;
        vehiculo.completarCarrera(posicion, kms_recorridos);
//        if(posicion == 1)
//        {
//            puntaje +=25;
//        }
//        else if(posicion == 2)
//        {
//            puntaje += 18;
//        }
//        else if(posicion == 3)
//        {
//            puntaje += 15;
//        }
//        else if(posicion == 4)
//        {
//            puntaje += 12;
//        }
//        else if(posicion == 5)
//        {
//            puntaje += 10;
//        }
//        else if(posicion == 6)
//        {
//            puntaje += 8;
//        }
//        else if(posicion == 7)
//        {
//            puntaje += 6;
//        }
//        else if(posicion == 8)
//        {
//            puntaje += 4;
//        }
//        else if(posicion == 9)
//        {
//            puntaje += 2;
//        }
//        else if(posicion == 10)
//        {
//            puntaje += 1;
//        }
//        else
//        {
//            puntaje += 0;
//        }
        
        switch(posicion)
        {
            case 1: puntaje += 25; 
                    break;
            case 2: puntaje += 18; 
                    break;
            case 3: puntaje += 15; 
                    break;
            case 4: puntaje += 12; 
                    break;
            case 5: puntaje += 10; 
                    break;
            case 6: puntaje += 8; 
                    break;
            case 7: puntaje += 6; 
                    break;
            case 8: puntaje += 4; 
                    break;
            case 9: puntaje += 2; 
                    break;
            case 10: puntaje += 1; 
                    break;
            default: puntaje += 0; 
                    break;
        }

    }
    
    private int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        LocalDate fecha_nacimiento = LocalDate.parse(this.fecha_nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));        
        Period dif_anios = Period.between(fecha_nacimiento, hoy);
        int edad = dif_anios.getYears();
        return edad;
    }
    
    public String informacionPiloto(){
        String info = "===========================================================\n" +
                "Datos Piloto\n-----------------------------------------------------------" + 
                "\n\tNombre              : " + nombre + 
                "\n\tEquipo              : " + equipo + 
                "\n\tPaís                : " + pais + 
                "\n\tFecha Nacimiento    : " + fecha_nacimiento + " (" + calcularEdad() + " años)" +
                "\n\tCategoria           : " + categoria +
                "\n\tCarreras Completadas: " + carreras_completadas + 
                "\n\tPuntaje             : " + puntaje + 
                "\n" + vehiculo.informacionVehiculo();
        return info;
     }
    
    
    
}
