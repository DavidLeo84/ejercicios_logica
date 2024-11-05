package co.edu.uniquindio;


import java.util.Arrays;
import java.util.Scanner;

public class PracticasApplication {

    public static void main(String[] args) {


       /* int[][] matriz = {
                {1,3,2,2,5,6,7,8,9,1},
                {1,3,2,2,5,6,7,8,9,1},
                {1,3,2,2,5,6,7,8,9,1},
                {1,3,2,2,5,6,7,8,9,1},
                {1,3,2,2,5,6,7,8,9,1},
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }*/

        /*
        int[][] matriz;

        int i = 0;
        int j = 0;
        matriz = new int[i][j];

        int[] tamanios = definirTamanio(matriz, i, j);

        llenarMatriz(matriz, i, j, tamanios);

    }

    public static int[] definirTamanio(int[][] matriz, int i, int j) {

        while (true) {
            System.out.println("Ingrese la cantidad de filas que desea en la matriz: ");
            Scanner teclado = new Scanner(System.in);
            i = teclado.nextInt();
            if (i % 2 == 0) {
                System.out.println("La cantidad de filas de la matriz debe ser impar. ");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Ingrese la cantidad de columnas que desea en la matriz: ");
            Scanner teclado = new Scanner(System.in);
            j = teclado.nextInt();
            if (j % 2 == 0) {
                break;
            } else {
                System.out.println("La cantidad de columnas debe ser par.");
            }
        }

        int[] array1 = new int[2];
        array1[0] = i;
        array1[1] = j;
        System.out.println("La matriz seleccionada será de tamaño: " + i + "x" + j + "");
        return array1;

    }

    public static void llenarMatriz(int[][] matriz, int i, int j, int[] tamanios) {
        i = tamanios[0];
        j = tamanios[1];
        int mitad = (i / 2) + 1;
        System.out.println(mitad);
        System.out.println(matriz.length);

    }
*/
    }
}