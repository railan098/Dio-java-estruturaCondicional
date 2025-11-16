package edu.java.condicionalsimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            // vvvvv A CORREÇÃO ESTÁ AQUI vvvvv
            scanner.nextLine(); // Esta linha "limpa" o Enter que sobrou do nextInt()
            // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

            if (idade >= 18) {
                System.out.println("--------------------");
                System.out.println("Olá, " + nome + "!");
                System.out.println("Você tem " + idade + " anos.");
                System.out.println("Acesso Permitido !");
            } else {
                System.out.println("--------------------");
                System.out.println("Olá, " + nome + "!");
                System.out.println("Você tem " + idade + " anos.");
                System.out.println("Acesso Negado, Você é menor !");
            }

            System.out.println("\n------------------------------");
            System.out.print("Deseja verificar outra pessoa? (s/n): ");
            continuar = scanner.nextLine(); // Agora esta linha vai esperar você digitar.

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa Finalizado");
        scanner.close();
    }
}