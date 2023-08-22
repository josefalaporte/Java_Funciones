/*Implementa una función que reciba un número entero y determine si es primo o no. Pide al usuario ingresar un número e indica si es primo o no en pantalla. */

package tarea;

import java.util.Scanner;

public class VerifPrimo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println (num + " Es un número primo");
        } else {
            System.out.println (num + " No es un número primo");
        }
        sc.close();
    }

    public static boolean esPrimo(int num) {
        if(num <= 1){
            return false;
        } if(num <= 3){
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i  = 6){
            if(num % i == 0 || num % (i+2) == 0){
                return false;
            }

        }
        return true;

    }
    
}
