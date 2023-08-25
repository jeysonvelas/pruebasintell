package org.example;

import java.util.Scanner;

//palabra invertida.

public class Main {
    public static void main(String[] args) {

        String palabra ="";
        String palabraInver = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese la palabra que desea invertir");

        palabra = teclado.nextLine();

        for (int i = palabra.length()-1; i >= 0 ; i--) {

            palabraInver += palabra.charAt(i);
        }

        for (int i = 0; i < palabra.length() ; i++) {

            palabraInver = palabra.charAt(i) + palabraInver;
        }

        for (char letter:  palabra.toCharArray()) {

            palabraInver = letter + palabraInver;

        }

        System.out.println("palabra invertida = " + palabraInver);

    }
}

