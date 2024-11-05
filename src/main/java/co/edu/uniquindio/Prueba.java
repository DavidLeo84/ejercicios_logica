package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Prueba {

    public static void main(String[] args) {

        out.println("-------------> ejercicio 1 <---------------");
        //llamada para obtener la suma de 5
        int numeroSumar = 10;
        out.println("La suma de los numeros de 1 hasta " + numeroSumar + " es " + sum(numeroSumar));

        out.println("-------------> ejercicio 2 <---------------");
        /*-------------> ejercicio 2 <---------------*/
        //cantidad de dígitos
        int n = 7422;
        int result = numero(n);
        out.println("El numero " + n + " tiene " + result + " cifras");

        out.println("-------------> ejercicio 3 <---------------");
        int num = 10;
        incre(num);
        out.println("");

        out.println("-------------> ejercicio 4 <---------------");
        int num1 = 10;
        decre(num1);
        out.println("");

        out.println("-------------> ejercicio 5 <---------------");
        int numFacto = 5;
        int resultadoFactorial = factorial(numFacto);
        out.println("El resultado del factorial de " + numFacto + " es = " + resultadoFactorial);

        out.println("-------------> ejercicio 6 <---------------");
        int numero = 6;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int encontrado = recorrerArray(array, numero, 0);
        out.println("El numero " + numero + " está en la posicion: " + encontrado);

        out.println("-------------> ejercicio 6 <---------------");
        out.println("");
        int[][] matriz = {
                {1, 496, 3},
                {28, 5, 6},
                {7, 120, 9}
        };
        recorrerMatriz(matriz, 0, 0);

        out.println("-------------> ejercicio 7 <---------------");
        out.println("");
        fibonacci(0, 1, 100);
        out.println("");
        out.println("-------------> ejercicio 8 <---------------");

        fibonacci_2(10);
        out.println("");
        out.println("-------------> ejercicio 9 <---------------");
        fibonacci_3();

        out.println("-------------> ejercicio 10 <---------------");
        int base = 2;
        int exp = 4;
        int resultadoPotencia = calcularPotencia(base, exp);
        out.println("El resultado de la potencia de base " + base + " con exponente " + exp + " es " + resultadoPotencia);

        out.println("-------------> ejercicio 11 <---------------");
        rectangulo(7, 3);
        rectangulo2(7);

        out.println("-------------> ejercicio 12 <---------------");
        String s = "reconocer";
        if (palin(s)) out.println("Es un palíndromo");
        else out.println("No es un palíndromo");

        out.println("-------------> ejercicio 13 <---------------");
        int numeroPrimo = 9;
        boolean primo = esPrimo1(numeroPrimo);
        out.println("¿El número " + numeroPrimo + " es primo? : " + primo);

        out.println("-------------> ejercicio 14 <---------------");
        boolean primo2 = esPrimo2(numeroPrimo);
        out.println("¿El número " + numeroPrimo + " es primo? : " + primo2);

        System.out.println("-------------> ejercicio 15 <---------------");
        int ejercicio = ejercicio0(1);
        System.out.println("¿El resultado del ejecicio0 es: " + ejercicio);

        System.out.println("-------------> ejercicio 16 <---------------");
        int ejercicio1 = ejercicio1(64);
        System.out.println("¿El resultado del ejecicio0 es: " + ejercicio1);

        System.out.println("-------------> ejercicio 17 <---------------");
        int totalPerfectos = contarPerfectos(matriz, 0, 0);
        System.out.println("La cantidad de números perfectos en la matriz es: " + totalPerfectos);

        System.out.println("-------------> ejercicio 18 <---------------");
        int x = sumaIterativa(10);
        out.println("EL valor de la suma iterativa de los primeros 10 numeros es = " + x);

        System.out.println("-------------> ejercicio 19 <---------------");
        int y = sumaRecursiva(10);
        out.println("El valor de la suma recursiva de los primeros 10 numeros es = " + y);

        System.out.println("-------------> ejercicio 20 <---------------");
        int w = 10;
        int[] arr = new int[w];
        int sumaTab = sumaTabulada(w, arr);
        out.println("El valor de la suma tabulada de los primeros 10 numeros es = " + sumaTab);

        System.out.println("-------------> ejercicio 21 <---------------");
        int sumaMemo = sumaMemorizada(w, arr);
        out.println("El valor de la suma memorizada de los primeros 10 numeros es = " + sumaMemo);

    }


    /**
     * método que devuelve la suma de los elementos desde n hasta 1
     *
     * @param n
     * @return
     */
    public static int sum(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }

    }

    /**
     * método que imprime dígitos de 1 hasta n
     *
     * @param n
     */
    public static void incre(int n) {

        if (n > 0) {
            incre(n - 1);
            out.print(n + " ");
        }
    }


    /**
     * método que imprime dígitos de n hasta 1
     *
     * @param n
     */
    static void decre(int n) {

        if (n == 0) {
            return;
        } else {
            out.print(n + " ");
            decre(n - 1);
        }
    }


    /**
     * método que devuelve la cantidad de dígitos de un numero positivo
     *
     * @param n
     * @return
     */
    static int numero(int n) {

        if (n == 0) {
            return 0;
        } else {
            return 1 + numero(n / 10);
        }
    }

    /**
     * metodo para calcular el factorial de un numero entero mayor a 1
     *
     * @param n = 5
     * @return = 120
     */
    public static int factorial(int n) {

        if (n > 12) {
            return -1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    /**
     * Metodo para buscar recursivamente un elemento en un array
     *
     * @param array
     * @param n
     * @param i
     * @return
     */
    public static int recorrerArray(int[] array, int n, int i) {

        if (i == array.length) {
            return -1;
        } else if (n == array[i]) {
            return i;
        } else {
            return recorrerArray(array, n, i + 1);
        }

    }


    /**
     * Metodo para recorrer de forma ordenada y recursiva los elementos de una matriz
     *
     * @param matriz
     * @param i
     * @param j
     */
    public static void recorrerMatriz(int[][] matriz, int i, int j) {

        out.print(matriz[i][j] + " ");
        /*Aca se pregunta si la i y la j estan dentro de los limites de la matriz*/
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {

            /*Aca se pregunta si la j esta en la ultima posición de la fila i */
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                out.println("");
            } else {
                j++;
            }
            recorrerMatriz(matriz, i, j);
        }
    }


    /**
     * Metodo que muestra los numeros fibonacci que existen hasta el numero n ingresado
     *
     * @param prev  = 0
     * @param next  = 1
     * @param limit = 100
     */
    public static void fibonacci(int prev, int next, int limit) {

        if (prev > limit) {
            return;
        } else {
            out.print(" " + prev);
            fibonacci(next, prev + next, limit);
        }
    }

    /**
     * Metodo que muestra los primeros N numeros fibonacci segun el numero n ingresado
     *
     * @param n = 10
     */
    public static void fibonacci_2(int n) {

        int[] nFibo = new int[n];
        nFibo[0] = 0; // Primer término
        if (n > 1) {
            nFibo[1] = 1; // Segundo término
            for (int i = 2; i < n; i++) {
                nFibo[i] = nFibo[i - 1] + nFibo[i - 2];
            }
        }
        for (int i = 0; i < nFibo.length; i++) {
            out.print(" " + nFibo[i]);
        }

    }


    /**
     * Metodo que indica si el numero ingresado es un numero fibonacci
     */
    public static void fibonacci_3() {

        Scanner scanner = new Scanner(in);
        out.print("Ingresa un numero entre 0 y 100: ");
        int numero = scanner.nextInt();

        int[] nFibo = new int[100];
        nFibo[0] = 0; // Primer término
        if (20 > 1) {
            nFibo[1] = 1; // Segundo término
            for (int i = 2; i < 100; i++) {
                nFibo[i] = nFibo[i - 1] + nFibo[i - 2];
            }
        }
        for (int i = 0; i < nFibo.length; i++) {
            if (nFibo[i] == numero) {
                out.println("El numero " + numero + " pertenece a la secuencia fibonacci");
            }
        }
        if (Arrays.stream(nFibo).noneMatch(i -> i == numero)) {
            out.println("El numero " + numero + " no pertenece a la secuencia fibonacci");
        }

    }


    /**
     * Metodo para calcular recursivamente el resultado de la potencia de un numero y exponente dado
     *
     * @param base
     * @param exp
     * @return
     */
    public static int calcularPotencia(int base, int exp) {

        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * calcularPotencia(base, exp - 1);
        }

    }

    /**
     * Metodos que imprimen un rectangulo con asteriscos (*)
     *
     * @param base
     * @param altura
     */
    public static void rectangulo(int base, int altura) {

        if (altura > 1) {
            rectangulo2(base);
            rectangulo(base, altura - 1);
        }
    }

    public static void rectangulo2(int n) {

        if (n > 0) {
            out.print("* ");
            rectangulo2(n - 1);
        } else {
            out.println();
        }

    }


    /**
     * Metodo para verificar una palabra palindroma
     *
     * @param frase
     * @return
     */
    public static boolean palin(String frase) {
        frase = frase.toLowerCase();
        if (frase.length() <= 1)
            return true;
        else {
            if (frase.charAt(0) == frase.charAt(frase.length() - 1))
                return palin(frase.substring(1, frase.length() - 1));
            else return false;
        }
    }

    /**
     * Metodo para calcular los numeros primos dado un numero positivo ingresado
     *
     * @param numero
     * @return
     */
    public static boolean esPrimo1(int numero) {

        int resultado = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                resultado = 1;
            }
        }
        if (resultado == 0 && numero != 1) {
            return true;
        }
        return false;
    }

    public static boolean esPrimo2(int numero) {
        boolean centinela = true;
        if (numero == 1) {
            centinela = false;
        }
        for (int i = 2; i <= numero / 2 && centinela == true; i++) {
            if (numero % i == 0) {
                centinela = false;
            }
        }
        return centinela;
    }

    public static int ejercicio0(int n) {

        if (n == 6) {
            return n;
        } else {
            return 4 * ejercicio0(n + 1);
        }
    }
    public static int ejercicio1(int n)
    {
        if (n == 1)
        {
            return n;
        }
        else
        {
            return 3 + ejercicio1 (n/2);
        }
    }

    // Método recursivo auxiliar para calcular la suma de los divisores propios
    private static int sumaDivisores(int numero, int divisor) {
        if (divisor > numero / 2) {
            return 0;
        }
        if (numero % divisor == 0) {
            return divisor + sumaDivisores(numero, divisor + 1);
        } else {
            return sumaDivisores(numero, divisor + 1);
        }
    }

    // Método principal para verificar si un número es perfecto
    public static boolean esPerfecto(int numero) {
        return sumaDivisores(numero, 1) == numero;
    }

    // Método recursivo para contar números perfectos en una matriz
    public static int contarPerfectos(int[][] matriz, int fila, int columna) {
        // Caso base: si hemos recorrido todas las filas
        if (fila == matriz.length) {
            return 0;
        }
        // Caso base: si hemos recorrido todas las columnas de la fila actual
        if (columna == matriz[fila].length) {
            return contarPerfectos(matriz, fila + 1, 0);
        }
        // Contar si el elemento actual es un número perfecto y continuar con el siguiente
        int count = esPerfecto(matriz[fila][columna]) ? 1 : 0;
        return count + contarPerfectos(matriz, fila, columna + 1);
    }

    public static int sumaIterativa(int n) {

        int suma = 0;
        for (int i = n; i > 0;) {
            suma += i + (i - 1);
            i = i - 2;
        }
        return suma;
    }

    public static int sumaRecursiva(int n) {

        if (n == 1) {
            return 1;
        }
        else {
            return n + sumaRecursiva(n - 1);
        }
    }

    public static int sumaTabulada(int n, int arr[]) {

        arr[0] = 1;
        int suma;
        for (int i = 1; i < n; i++) {
            suma = arr[i - 1] + (i + 1);
            arr[i] = suma;
        }
        return arr[n - 1];
    }

    public static int sumaMemorizada(int n, int arr[]){

        if(n == 1) {
            arr[0] = 1;
            return arr[0];
        }
        else {
            arr[n - 1] = n + sumaMemorizada(n - 1, arr);
            return arr[n - 1];
        }
    }

}
