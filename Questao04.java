/*4. Faça um programa, com uma função que necessite de um argumento. A
função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se
seu argumento for zero ou negativo.
 */
package com.mycompany.psc.lista082024;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número maior que 0: ");
        double numero = ler.nextDouble();

        verificador(numero);

    }

    public static double verificador(double a) {

        if (a <= 0) {

            System.out.print("N");

        } else {

            System.out.print("P");

        }
        
        return a;

    }
}
