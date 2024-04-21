/*3. Faça um programa, com uma função que necessite de três argumentos, e que
forneça a soma desses três argumentos.*/
package com.mycompany.psc.lista082024;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("INFORME 3 VALORES: ");
        double valor1 = ler.nextDouble();
        double valor2 = ler.nextDouble();
        double valor3 = ler.nextDouble();
        
        double resultado = funcao(valor1 , valor2, valor3);
        
        System.out.print("A soma dos três números será: " +resultado);
        
    }
    
    public static double funcao(double valor1, double valor2, double valor3){
        
        return valor1 + valor2 + valor3;
        
    }
    
}
