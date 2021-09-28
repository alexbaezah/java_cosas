package com.duoc.clases;

import java.text.DecimalFormat;

public class Vehiculo {
    
    //ATRIBUTOS
    private String modelo;
    private String fabricante;
    private double kms_recorridos = 0;
    private int victorias = 0;
    private int carreras = 0;

    //CONSTRUCTORES
    public Vehiculo() {
    }

    public Vehiculo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    //ACCESADORES & MUTADORES
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getKms_recorridos() {
        return kms_recorridos;
    }

    private void setKms_recorridos(double kms_recorridos) {
        this.kms_recorridos = kms_recorridos;
    }

    public int getVictorias() {
        return victorias;
    }

    private void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getCarreras() {
        return carreras;
    }

    private void setCarreras(int carreras) {
        this.carreras = carreras;
    }
    
    
    //METODOS CUSTOM
    public void completarCarrera(int posicion, double kms){
        carreras++;
        kms_recorridos += kms;
        if (posicion == 1)
        {
            victorias++;
        }
    }
    
    public String informacionVehiculo(){
        DecimalFormat formato_kms = new DecimalFormat("#,##0.00");
        String info = "Datos Vehículo\n-----------------------------------------------------------" + 
                "\n\tModelo              : " + modelo +
                "\n\tFabricante          : " + fabricante + 
                "\n\tKms. recorridos     : " + formato_kms.format(kms_recorridos) +
                "\n\tVictorias           : " + victorias + 
                "\n\tCarreras            : " + carreras;
        return info;
    }
    
    
}
