package edu.java.condicionalsimples;
//x Saldo Conta estrurura condicional 
import java.util.Scanner;

public class SaldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double SaldoTotal = 1000;
        String continuar;


        do {

            System.out.println("Valor Disponivel para Saque R$"+SaldoTotal);
            System.out.println("Qual Valor deseja sacar?: ");
            double SacarValor = scanner.nextDouble();




        if (SacarValor <= SaldoTotal && SacarValor > 0) {
            SaldoTotal = SaldoTotal - SacarValor;
            System.out.println("Saque Realizado");
            System.out.println("\n---------------------");
            System.out.println("Valor Sacado R$" + SacarValor);
            System.out.println("Valor Atual em Conta R$" + SaldoTotal);

        }
        else if (SacarValor >= 5000){
            System.out.println("Valor Limite para Saque é R$ 5000.00 por dia");

        }
        else {
            System.out.println("Valor que deseja sacar é insuficiênte");
            System.out.println("Valor Atual R$" + SaldoTotal);
        }
        scanner.nextLine();

        System.out.println("\n------------------------------");
        System.out.print("Deseja verificar outra pessoa? (s/n): ");
        continuar = scanner.next();


        }while (continuar.equalsIgnoreCase("s"));
        System.out.println("Programa Finalizado");

        scanner.close();
    }
}
