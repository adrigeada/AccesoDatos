package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicios {
    static Scanner teclado = new Scanner(System.in);
    static void main() {
        //ej1();
        //ej3();
        ej4();
        //ej4Mapa();
        //ej5();

    }

    static void ej1(){
        System.out.print("Dime tu nombre: ");
        String nombre = teclado.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola "+nombre);
        }

    }

    static void ej3(){
        System.out.println("Elige un número del 1 al 12");
        int numMes = teclado.nextInt();

        switch (numMes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Escribe un número entre 1 y 12");
        }

    }

    static void ej4(){
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int numMes = 0;

        do{
            System.out.println("Elige un número del 1 al 12");

            try {
                numMes = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Escribe un numero, bobo.");
            }


        }while(numMes<1 || numMes > 12);

        System.out.println(meses[numMes-1]);

    }

    static void ej4Mapa(){
        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Enero");
        mapa.put(2,"Febrero");
        mapa.put(3,"Marzo");
        mapa.put(4,"Abril");
        mapa.put(5,"Mayo");
        mapa.put(6,"Junio");
        mapa.put(7,"Julio");
        mapa.put(8,"Agosto");
        mapa.put(9,"Septiembre");
        mapa.put(10,"Octubre");
        mapa.put(11,"Noviembre");
        mapa.put(12,"Diciembre");

        System.out.println("Elige un numero del 1 al 12");
        int num = teclado.nextInt();
        System.out.println(mapa.get(num));
    }

    static void ej5(){
        System.out.println("Elige un número");
        int numMes = teclado.nextInt();

        if (esPrimo(numMes)){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }

        if (esPalindromo(numMes)){
            System.out.println("El numero es palindromo");
        }else {
            System.out.println("El numero no es palindromo");
        }



    }

    static boolean esPrimo(int num){

        if (num <= 1){
            return false;
        }else if (num <= 3){
            return true;
        } else{

            for (int i = 2; i < num; i++) {

                if (num%i == 0){
                    return false;
                }
            }

        }

        return true;
    }

    static boolean esPalindromo(int num){

        String numString = Integer.toString(num);
        String[] vector = numString.split("");
        int[] vectorNumeros = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            vectorNumeros[i] = Integer.parseInt(vector[i]);
        }

        for (int i = 0; i < vectorNumeros.length/2; i++) {

            if (vectorNumeros[i] != vectorNumeros[vectorNumeros.length-1-i]){
                return false;
            }

        }

        return true;
    }
}
