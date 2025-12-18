/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Pole
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String[] nombresEncargados = new String[5];
        double[][] produccionMensual = new double[5][12];
        double[] totalProduccion = new double[5];
        
        String reporte = "";
        
        double maxProduccion = totalProduccion[0];
        int indiceMasProductivo = 0;
        
        
        for (int fila = 0; fila < nombresEncargados.length; fila++) {
            System.out.print("Ingrese nombre del encargado estación " + (fila + 1) + ": ");
            nombresEncargados[fila] = entrada.nextLine();

            double suma = 0;
            for (int columna = 0; columna < 12; columna++) {
                System.out.print("  Producción mes " + (columna + 1) + ": ");
                produccionMensual[fila][columna] = entrada.nextDouble();
                suma += produccionMensual[fila][columna];
            }
            entrada.nextLine(); 

            totalProduccion[fila] = suma;

            reporte = String.format("%s%s Estación %d - Total Producción: $ %.0f\n",
                    reporte,
                    nombresEncargados[fila],
                    (fila + 1),
                    totalProduccion[fila]);

            if (totalProduccion[fila] > maxProduccion) {
                maxProduccion = totalProduccion[fila];
                indiceMasProductivo = fila;
            }
        }

        reporte = String.format("%s\nEstación más productiva: Estación %d\n"
                + "Encargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $ %.0f\n",
                reporte,
                (indiceMasProductivo + 1),
                nombresEncargados[indiceMasProductivo],
                maxProduccion);

        System.out.printf("%s", reporte);

    }

}
