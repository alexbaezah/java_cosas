package com.duoc.clases;

import java.util.Scanner;

/**
 *
 * @author Christian Sarmiento
 * @version v1.0
 * @since septembre 22th, 2020
 */
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        TarjetaCredito tc1 = new TarjetaCredito("5491-4567-1234-0123",1500000,1500000,true);
        TarjetaCredito tc2 = new TarjetaCredito("5491-1235-7895-4563",500000,500000,false);
        
        Cliente cli01 = new Cliente("15151515-K","Aquiles","Bailo",25,1000000,tc1);
        System.out.println("**********************************************");
        System.out.println("Acciones con el primer cliente");
        System.out.println(cli01.informacionCliente());        
        System.out.println(cli01.getTc().comprar(1000000));        
        System.out.println(cli01.informacionCliente());
        System.out.println("**********************************************");
        
        //Proceso de lectura de todos los datos y creación del cliente asignando la tc2
        System.out.println("Acciones con el segundo cliente");
        System.out.print("Ingrese su rut: ");
        String rut = lector.next();
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = lector.next();
        System.out.print("Ingrese su edad [18 - 90]: ");
        int edad = lector.nextInt();
        System.out.print("Ingrese su sueldo: $ ");
        int sueldo = lector.nextInt();
        
        Cliente cli02 = new Cliente(rut, nombre, apellido, edad, sueldo, tc2);
        
        System.out.println("Acciones con el segundo cliente");
        System.out.println(cli02.informacionCliente());
        System.out.println("Trantando de comprar... " + cli02.getTc().comprar(120000));
        System.out.println("Como la tarjeta esta bloqueada... desbloquiemos la tarjeta... " +cli02.getTc().desbloquearTarjeta());
        System.out.println("Trantando de comprar... " +cli02.getTc().comprar(120000));
        
        
        //Generar un ciclo iterativo de compras
        System.out.println("**********************************************");
        char respuesta = 's';        
        do
        {
            System.out.print("Ingrese monto venta: ");
            int monto = lector.nextInt();
            System.out.println("comprando... " + cli01.getTc().comprar(monto));
            System.out.println(cli01.informacionCliente());
            System.out.print("Deseas realizar una nueva compra? [s/n]: ");
            respuesta = lector.next().charAt(0);
        }while(respuesta == 's');
        
        
    }
}
