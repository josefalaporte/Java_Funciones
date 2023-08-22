/*Crea una función que reciba dos números como parámetros y devuelva el mayor de ellos. Luego, pide al usuario ingresar dos números y muestra el resultado en pantalla. */

package tarea;

import java.util.Scanner;

public class MayorDe2 {

    public static int numbMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;

        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int mayor = numbMayor(num1, num2);

        System.out.println("El número mayo es: " + mayor);

        sc.close();

    }

}
