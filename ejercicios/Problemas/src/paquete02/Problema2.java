/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] viviendas = new String[10];
        double[][] mensual = new double[10][12];
        double[] anual = new double[10];

        viviendas  = obtenerDatos();
        mensual = consumoMensual();
        anual = consumoAnual(mensual);
        imprimirDatos(viviendas, anual);
    }

    public static String[] obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Ingrese el nombre de la vivienda %d\n", i + 1);
            a [i] = entrada.nextLine();
        }
        return a ;
    }

    public static double [][] consumoMensual() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] b = new double[10][12];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
            System.out.printf("Ingrese el consumo de la vivienda %d en "
                    + "el mes %d\n", i + 1, j + 1);
            b [i][j] = entrada.nextInt();
            }
        }    
        return b;
    }
        
    public static double [] consumoAnual(double[][] meses) {
        double [] años = new double [10];
        for (int i = 0; i < meses.length; i++) {
            double suma = 0;
            for (int j = 0; j < meses[i].length; j++) {
                suma = suma + meses[i][j];
            }
        años [i] = suma;
        }
        return años;
    }
    
    public static void imprimirDatos (String [] a, double [] b) {
        String msj = "";
        for (int i = 0; i < a.length; i++) {
            msj = String.format("%sEl consumo de la vivienda %s (%d) es de: "
                    + "$%.2f\n", msj, a[i], i + 1, b[i]);
        }
        System.out.printf(msj);
    }
}    
