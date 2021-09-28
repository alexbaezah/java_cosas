package com.duoc.clases;

public class Main {

    public static void main(String[] args) {
        Vehiculo v01 = new Vehiculo("La Ferrari","Ferrari");
        Piloto pilot01 = new Piloto("Armando Casas", "Red Devils", "Chile", "09-09-2000", "GT", v01);
        
        pilot01.ingresarDatosCarrera(2, 150000);
        pilot01.ingresarDatosCarrera(1, 185000);
        pilot01.ingresarDatosCarrera(3, 200000);
        pilot01.ingresarDatosCarrera(1, 190000);
        pilot01.ingresarDatosCarrera(1, 150000);        
        System.out.println(pilot01.informacionPiloto());
        
        Vehiculo v02 = new Vehiculo("917","Porsche");
        Piloto pilot02 = new Piloto("Alan Brito", "Blue pills", "Argentina", "05-06-1998", "GT", v02);
        pilot02.ingresarDatosCarrera(1, 150000);
        pilot02.ingresarDatosCarrera(3, 185000);
        pilot02.ingresarDatosCarrera(6, 200000);
        pilot02.ingresarDatosCarrera(2, 190000);
        pilot02.ingresarDatosCarrera(2, 150000);
        System.out.println(pilot02.informacionPiloto());
        
        
    }
    
}
