/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        // forma 1
        int[][] arreglo1 = new int[3][4];
        
        // forma 2
        int[][] arreglo2 = {{10, 20, 30}, {100, 200, 300}};
        
        // Cadena
        String [][] arregloCadena = {{"Ana", "José", "Pedro"}, 
                                     {"Luis", "María", "Marco"}};
        
        // forma 3
        int[][] arreglo3 = new int[3][];
        arreglo3[0] = new int[2];
        arreglo3[1] = new int[2];
        arreglo3[2] = new int[2];
        
        // forma 4
        int[][] arreglo4 = {{10, 20}, {100, 200, 300}};
        
        System.out.printf("%s\n", arreglo1[0][2]);
    }
    
}
