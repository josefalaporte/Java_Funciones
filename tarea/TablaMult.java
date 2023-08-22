/*Crea una función que muestre la tabla de multiplicar de un número entero dado. Pide al usuario ingresar un número y muestra su tabla de multiplicar del 1 al 10.*/

package tarea;

import java.util.Scanner;

public class TablaMult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }

}
