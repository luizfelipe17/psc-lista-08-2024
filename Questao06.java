/*6. Faça um programa que converta da notação de 24 horas para a notação de 12
horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada
é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer
a conversão e uma para a saída. Registre a informação A.M./P.M. como um
valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões
terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que
permita que o usuário repita esse cálculo para novos valores de entrada todas
as vezes que desejar.*/
package com.mycompany.psc.lista082024;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        boolean validador = true;
        int horas, minutos;

        while (validador) {

            System.out.print("Horas: ");
            horas = ler.nextInt();

            while (horas < 1 || horas > 24) {

                System.out.print("Informe um valor válido\n\n");
                System.out.print("Horas: ");
                horas = ler.nextInt();

            }

            System.out.print("Minutos: ");
            minutos = ler.nextInt();

            while (minutos < 0 || minutos > 59) {

                System.out.print("Informe um valor válido\n\n");
                System.out.print("Minutos: ");
                minutos = ler.nextInt();

            }

            conversao(horas, minutos);

            System.out.println("DESEJA INFORMAR OUTRO HORARIO: S/N");
            String opcao = ler.next();

            if (opcao.equalsIgnoreCase("N")) {

                System.out.print("Obrigado!!");
                break;

            } else if (opcao.equalsIgnoreCase("S")) {

                System.out.print("\nInforme: \n");

            } else {

                break;

            }
        }
    }

    public static void conversao(int horas, int minutos) {

        String formato = "";
        int horas12 = 0;

        if (horas > 1 && horas < 12) {

            horas12 = horas;
            formato = "A";

        } else if (horas > 12 && horas <= 23) {

            horas12 = horas - 12;
            formato = "P";

        } else if (horas == 24) {

            horas12 = 00;
            formato = "A";
        }

        imprimirHoras(horas12, formato, minutos);

    }

    public static void imprimirHoras(int horas12, String formato, int minutos) {

        Scanner ler = new Scanner(System.in);

        System.out.print(+horas12 + "h" + minutos + " " + formato + ".M.\n\n");

    }
}
