package com.example;

class CriancoClasse {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        System.out.println();
        Cliente cliente = new Cliente();
        cliente.setRenda(10000);
        cliente.setSexo('F');
        cliente.setAnoNaescimento(1983);
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNaescimento());
        
        System.out.println();

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(5000);
        cliente2.setSexo('M');
        cliente2.setAnoNaescimento(1984);
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNaescimento());

    }
    
}
