/*5. Faça um programa com uma função chamada somaImposto. A função possui
dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre
vendas expressa em porcentagem e custo, que é o custo de um item antes do
imposto. A função “altera” o valor de custo para incluir o imposto sobre
vendas.*/
package com.mycompany.psc.lista082024;
import java.util.Scanner;

public class Questao05 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Informe o valor de custo do produto: R$");
        double custo = ler.nextDouble();
        System.out.print("Informe a taxa de imposto: ");
        double taxaImposto = ler.nextDouble();
        
        double valorComImposto = somaImposto(custo, taxaImposto);
        
        System.out.printf("\nO valor com a taxa de imposto será de: R$%.2f" ,valorComImposto);
        
    }
    
    public static double somaImposto(double custo, double taxaImposto){
        
        double valorComImposto = custo + (custo * taxaImposto / 100);
        
        
        return valorComImposto;
    }
}
