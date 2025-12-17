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
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        // forma 1
        int[][] arreglo1 = new int[3][4]; //
        System.out.printf("Uso de la opción length: %d\n", arreglo1.length);

        System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]);

        arreglo1[0][2] = 1000;
        arreglo1[1][2] = 3000;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {

                if (arreglo1[fila][col] > 0) {
                    System.out.printf("fila[%d] columna[%d] = %d\n",
                            fila, col, arreglo1[fila][col]);

                }

            }

        }
    }

}
