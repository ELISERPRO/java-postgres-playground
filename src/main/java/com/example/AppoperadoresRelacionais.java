package com.example;

public class AppoperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNaescimento(1983);

        var cliente2 = new Cliente();
        cliente2.setAnoNaescimento(1984);
        if(cliente1.getAnoNaescimento() == cliente2.getAnoNaescimento()){
            System.out.println("Os Clientes nasceram no memo ano " );
            System.out.println("O ano de nascimento dos clientes é: " + cliente1.getAnoNaescimento());
       
        }else{
            System.out.println("Os Clientes nasceram em anos diferentes " );
            System.out.println("O cliente 1 nasceu em: " + cliente1.getAnoNaescimento());
            System.out.println("O cliente 2 nasceu em: " + cliente2.getAnoNaescimento());


        }
    }
    
}
