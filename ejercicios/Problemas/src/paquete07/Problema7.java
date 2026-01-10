/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] ciudades = obtenerArreglo();
        imprimirCiudades(ciudades);
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el número de ciudades");
        int n = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo = new String[n];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una ciudad de Ecuador:");
            arreglo[i] = entrada.nextLine();
        }

        return arreglo;
    }

    public static void imprimirCiudades(String[] arreglo) {
        System.out.println("\nCiudades con 4 o 5 caracteres:");

        for (int i = 0; i < arreglo.length; i++) {
            int longitud = arreglo[i].length();

            if (longitud == 4 || longitud == 5) {
                System.out.println(arreglo[i]);
            }
        }
    }
}
