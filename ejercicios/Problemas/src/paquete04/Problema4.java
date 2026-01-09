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
        int ci = 0;
        String nombre = "";
        System.out.println("Ingrese la opción necesitada (1, 2)");
        rta = entrada.nextInt();

        if (rta == 1 || rta == 2) {
            System.out.println("Ingrese su cédula de identidad");
            ci = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese sus nombres completos");
            nombre = entrada.nextLine();
        }

        if (rta == 1) {
            calcularValorLuz(ci, nombre);
        } else if (rta == 2) {
            calcularPredio(ci, nombre);
        } else {
            System.out.println("Opción Inválida");
        }

    }

    public static void calcularValorLuz(int a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorKv;
        double numeroKvMes;
        double total;
        System.out.println("Ingrese el valor por kilovatio");
        valorKv = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos "
                + "en el mes");
        numeroKvMes = entrada.nextDouble();
        total = valorKv * numeroKvMes;
        System.out.printf("\nREPORTE DE LUZ\n------------------"
                + "------------\nCliente %s con cédula %d debe cancelar el "
                + "valor de $%.2f\n", b, a, total);

    }
    
    public static void calcularPredio(int a, String b){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorInmueble;
        double total;
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        total = valorInmueble * 0.02;
        System.out.printf("\nREPORTE DE PREDIO\n------------------"
                + "------------\nCliente %s con cédula %d "
                + "tiene un inmueble valorado en $%.0f y debe cancelar "
                + "de predio $%.2f\n", 
                b, a, valorInmueble, total);
        
    }
}
