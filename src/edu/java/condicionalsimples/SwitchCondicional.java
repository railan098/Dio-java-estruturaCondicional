package edu.java.condicionalsimples;

import java.util.Scanner;

public class SwitchCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        do {


            System.out.println("Digite o Seu DDD ");
            int ddd = scanner.nextInt();

            switch (ddd) {
                case 66: {
                    System.out.println("Mato Grosso");
                    break;
                }

                case 64: {
                    System.out.println("Goias");
                    break;
                }
                default: {
                    System.out.println("DDD Não esta na Lista Case");
                }
            }

            System.out.println("\n------------------------------");
            System.out.print("Deseja verificar outra pessoa? (s/n): ");
            continuar = scanner.next();

        }while (continuar.equalsIgnoreCase("s"));

    }
}
