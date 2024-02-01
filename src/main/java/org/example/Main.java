package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadProducto;
        double costoTotal=0.0;
        double sumatoriaCostos=0.0;
        Scanner keyboard = new Scanner(System.in);

        //proceso
        //1. CREAR UN MENU DE OPCIONES
        System.out.println("******peluchitos SA******");
        System.out.println("1. Cumpleaños");
        System.out.println("2. Dia de la mujer");
        System.out.println("3. Baby showers");
        System.out.println("4. SALIR");

        //2. Construir un ciclo para permitir que el usuario escoja

        do {
            System.out.print("digita la opcion deseada: ");
            opcion=keyboard.nextInt();

            //3. Evaluando las opciones del menu
            if(opcion==1){
                System.out.print("Digita cuantos kit de cumpleaños deseas: ");
                cantidadProducto=keyboard.nextInt();
                costoTotal=180000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            } else if (opcion==2){
                System.out.print("Digita cuantos kit de mujer deseas: ");
                cantidadProducto=keyboard.nextInt();
                costoTotal=60000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            } else if (opcion==3) {
                System.out.print("Digita cuantos kit de bebe deseas: ");
                cantidadProducto=keyboard.nextInt();
                costoTotal=250000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            } else if (opcion==4) {
                System.out.println("gracias hasta pronto");
            }else{
                System.out.println("Digita una opcion valida");
            }



        }while (opcion!=4);
        System.out.println("El costo es de: "+costoTotal);




    }
}