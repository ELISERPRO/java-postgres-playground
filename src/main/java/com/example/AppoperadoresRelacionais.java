package com.example;

public class AppoperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNaescimento(1987);
        
        var cliente2 = new Cliente();
        cliente2.setAnoNaescimento(1983);

        boolean cliente1maisjovem = cliente1.getAnoNaescimento() > cliente2.getAnoNaescimento();
        boolean cliente1maisvelho = cliente1.getAnoNaescimento() < cliente2.getAnoNaescimento();
        
        if(cliente1maisjovem){
            System.out.println("O cliente 1 é mais novo que cliente 2 " );
            
       
        }else if(cliente1maisvelho){
            System.out.println("O cliente 1 é mais velho que o cliente 2");
        }
        else System.out.println("Os Clientes nasceram no mesmo ano" );
            


        }
    }
    

