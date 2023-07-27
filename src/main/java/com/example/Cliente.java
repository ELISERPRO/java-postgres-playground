package com.example;

public class Cliente {
    private double renda;
    private char sexo;
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