/*1. Faça um programa para imprimir:
1
2 2
3 3 3
.....
n n n n n n ... n
para um n informado pelo usuário.
Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.*/
package com.mycompany.psc.lista082024;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        repeticao();

    }

    public static void repeticao() {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int n = ler.nextInt();

        for (int i = 0; i <= n; i++){
            
            for (int j = 1; j <= i; j++){
                
               System.out.print(i + " ");
                
            }
            
            System.out.println();
            
        }
        
    }
}
