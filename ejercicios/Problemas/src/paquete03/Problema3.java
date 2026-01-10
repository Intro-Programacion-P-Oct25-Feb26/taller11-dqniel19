/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int rta;

        System.out.println("Ingrese el procedimiento requerido "
                + "(1: área cuadrado, 2: área triángulo, 3: área rectángulo)");
        rta = entrada.nextInt();

        if (rta == 1) {
            areaCuadrado();
        } else if (rta == 2) {
            areaTriangulo();
        } else if (rta == 3) {
            areaRectangulo();
        } else {
            System.out.println("Opción Invalida");
        }
    }

    public static void areaCuadrado() {
        double lado;
        double area;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la medida de los lados");
        lado = entrada.nextDouble();
        area = lado * 4;
        
        System.out.printf("El área de un cuadrado con %.2f de medida por lado "
                + "es: %.2f\n", lado, area);
    }
    
    public static void areaTriangulo() {
        double base;
        double altura;
        double area;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la medida de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        
        System.out.printf("El area de un triangulo con %.2f de base y %.2f "
                + "de altura es de: %.2f\n", base, altura, area);
    }
    
    public static void areaRectangulo()  {
        double base;
        double altura;
        double area;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la medida de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        altura = entrada.nextDouble();
        area = (base * altura);
        
        System.out.printf("El area de un rectangulo con %.2f de base y %.2f "
                + "de altura es de: %.2f\n", base, altura, area);
    }
    
    
}
