package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.beans.binding.ListBinding;

public class AppListas {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new LinkedList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Eliane");
        cliente1.setAnoNaescimento(1983);
        cliente1.setRenda(10000);

        var cliente2 = new Cliente();
        cliente2.setNome("Alan");
        cliente2.setAnoNaescimento(1984);
        cliente2.setRenda(12000);


        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        listaClientes.remove(0);
        

       for (var cliente : listaClientes) {
        System.out.println(cliente);
            
        }
        
        
    }
}
