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
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        // forma 1
        int[][] arreglo1 = {
            
            {10, 20, 40},  // fila 0
            
            
            {1, 2, 3} // fila 1
        
        };
        
        int suma = 0;
        
        for (int fila = 0; fila < arreglo1.length; fila++) { // 0<2 // 1<2
            // suma = 0;
            for (int col = 0; col < arreglo1[fila].length; col++) { // arreglo1[0].length:3 
                                                                    // 0<3 // 1<3 // 2<3 // 3<3
                suma = suma + arreglo1[fila][col];
                     // 0 + arreglo1[0][0] // 0 + 10 // 10
                     // 10 + arreglo1[0][1] // 10 + 20 // 30
                     // 30 + arreglo1[0][2] // 30 + 40 // 70
            }
            System.out.printf("Suma de valores del arreglo: %d\n", suma);
        }
        
        // System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }
    
}
/*
fila: 0, 1
col: 0, 1, 2, 3
suma: 0, 30, 70, 0
pantalla:
Suma de valores del arreglo: 70



*/