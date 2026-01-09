/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        int[][] total = sumaArreglos(informacion, informacion2);
        
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) { 
                System.out.printf("%d\t", total[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static int[][] sumaArreglos(int[][] a, int[][] b){
        int[][] c = new int [3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    } 
       
}
