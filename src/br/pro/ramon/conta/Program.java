package br.pro.ramon.conta;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Conta conta = new Conta();

        boolean sair = false;
        do {
            System.out.println("Saldo: R$ " + conta.getSaldo());
            System.out.println("O que você quer fazer? ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Sair");
            System.out.print("Sua opção: ");
            String opcao = console.nextLine();

            switch (opcao) {
                case "1": {
                    try {
                        System.out.print("Qual valor? ");
                        double valor = Double.parseDouble(console.nextLine());
                        conta.depositar(valor);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Valor inválido!");
                    }
                    break;
                }
                case "2": {
                    try {
                        System.out.print("Qual valor? ");
                        double valor = Double.parseDouble(console.nextLine());
                        conta.sacar(valor);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Valor inválido!");
                    }
                    break;
                }
                case "3":
                    sair = true;
                    break;
                default:
            }
            
            System.out.println();
        } while (!sair);
    }
}
