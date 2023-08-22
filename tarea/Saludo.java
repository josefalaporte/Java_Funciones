package tarea;

/* Escribe un programa que pida al usuario su nombre y luego lo salude personalizadamente utilizando una función que reciba el nombre como parámetro y devuelva el mensaje de saludo.*/

import java.util.Scanner;

public class Saludo {

    public static String generarSaludo(String nomb) {
        return "Hola, " + nomb + " Bienvenid@!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        String saludo = generarSaludo(nombre);
        System.out.println(saludo);

        scanner.close();

    }

}
