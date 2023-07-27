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
        System.out.println("Espcial: " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(12000,'M',1984);
        
        
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNaescimento());
        System.out.println("Espcial: " + cliente2.isEspecial());
    }
    
}
