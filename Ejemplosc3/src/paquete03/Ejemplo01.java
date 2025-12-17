/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jose A", "Elena J", "Paúl L"};
        double[] sumaNotas = new double[3];
        String[] promedioNotasCualitativas = new String[3];
        // 0 - 5.9 Bueno
        // 6 - 8.9 Muy Bueno
        // 9 - 10 Sobresaliente

        double suma;
        String reporte = "";
        double promedio;
        for (int i = 0; i < notas.length; i++) { // 0<3
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) { // 0<notas[0].length
                // 0<4 // 1<4 // 2<4 // 3<4 // 4<4
                suma = suma + notas[i][j];
                // 0 + notas[0][0] // 0 + 9 // 9
                // 9 + notas[0][1] // 9 + 10 // 19
                // 19 + notas[0][2] // 19 + 7 // 26
                // 26 + notas[0][3] // 26 + 8 // 34

            }
            sumaNotas[i] = suma; // 
            promedio = suma / 4;
            if (promedio > 0 && promedio <= 5.9) {
                promedioNotasCualitativas[i] = "Bueno";
            } else {
                if (promedio >= 6 && promedio <= 8.9) {
                    promedioNotasCualitativas[i] = "Muy bueno";
                } else {
                    if (promedio >= 9 && promedio <= 10) {
                        promedioNotasCualitativas[i] = "Sobresaliente";
                    } else {
                        promedioNotasCualitativas[i] = "Fuera de rango";
                    }
                }
            }
        }
        // Presentación de resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene una sumataria "
                    + "de notas: %.3f y su promedio es: %s\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i],
                    promedioNotasCualitativas[i]);
        }

        System.out.printf("%s\n", reporte);

    }
}
