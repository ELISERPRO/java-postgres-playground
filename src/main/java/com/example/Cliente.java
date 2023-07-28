package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private boolean especial;
    private String nome;

    
    
    public Cliente(){
        System.out.println("Criando um construtor sem parametros ");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;
            

    }
    public Cliente(double renda, char sexo,int anoNaescimento){
        this();
        System.out.println("Criando um construto com parametros ");
        this.renda = renda;
        this.sexo = sexo;
        this.anoNaescimento = anoNaescimento;
    }


        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;      

    }
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("Sexo Invalido");
    }

    public int getAnoNaescimento() {
        return anoNaescimento;
    }
    public void setAnoNaescimento(int anoNaescimento) {
        this.anoNaescimento = anoNaescimento;
    }
    private int anoNaescimento;
    public double getRenda() {
    return renda;
   }
   public void setRenda(double renda){
    if (renda >=  0)
        this.renda = renda;
    else System.out.println("A renda é imcompativel ");
   }

}