package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite a Renda: ");
        cliente.setRenda(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite o sexo: ");
        String sexo = (scanner.nextLine());
        cliente.setSexo(sexo.charAt(0));
        

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNaescimento(scanner.nextInt());
        
       

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNaescimento());
        System.out.println("Espcial: " + cliente.isEspecial());
        System.out.println();

        

    }
    
}
