/* Escribe una función que reciba un número entero positivo N como parámetro y calcule la suma de los primeros N números naturales. Pide al usuario ingresar un número N e imprime el resultado*/

package tarea;

import java.util.Scanner;

public class SumFirstNumb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número:");
        int n = scanner.nextInt();
        int suma = SumFirst(n);
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
        scanner.close();
    }

    public static int SumFirst(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;

    }

}
