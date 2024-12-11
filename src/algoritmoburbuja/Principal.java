/* 
Algoritmo de Ordenamiento por el Método Burbuja
Por Esdras Pérez
*/
package algoritmoburbuja;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        System.out.print("Digite la cantidad de elementos para el arreglo: ");
        nElementos = entrada.nextInt(); // Guarda la cantidad de elementos del usuario
        arreglo = new int[nElementos]; // Asigna el numero de elementos al arreglo
        
        // Llenado del arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: "); 
            arreglo[i] = entrada.nextInt();
        }
        
        // Método Burbuja
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) { // Si numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        // Mostrando el arreglo ordenado en forma ascendente
        System.out.println("\nArreglo ordenado en forma ascendente:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        
        // Mostrando el arreglo ordenado en forma descendente
        System.out.println("\nArreglo ordenado en forma descendente:");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
