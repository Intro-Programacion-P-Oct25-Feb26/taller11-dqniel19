/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int rta;
        int ci;
        String nombre;
        System.out.println("Ingrese la opción necesitada (1, 2)");
        rta = entrada.nextInt();

        if (rta == 1 || rta == 2) {
            System.out.printf("Ingrese su cédula de identidad");
            ci = entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Ingrese sus nombres completos");
            nombre = entrada.nextLine();
        }

        if (rta == 1) {
            calcularValorLuz(ci, nombre);
        } else if (rta == 2) {
            calcularPredio(ci, nombre);
        } else {
            System.out.println("Opción Invalida");
        }

    }

    public static void calcularValorLuz(int a, String b) {
        // calcular luz con la formula dada
        // presentar los datos
        // hacer otro procedimiento con la otra formula
        // presentar datos nuevamente
    }
    public static void calcularPredio(int a, String b){}

}
