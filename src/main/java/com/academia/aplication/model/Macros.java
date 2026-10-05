package com.academia.aplication.model;

public class Macros extends Aluno{
    private double proteinaDiaria = 2.0 * getPeso();

    private double TMB;
        public void calculoTMB(){
            if(getSexo() == 1){
                this.TMB = (10 * getPeso()) +(6.25 * getAltura()) - (5 * getIdade()) + 5; //homem
            } else if(getSexo() == 2){
                this.TMB = (10 * getPeso()) +(6.25 * getAltura()) - (5 * getIdade()) - 161; //mulher
            } else {

            }

        }

    public double getTMB(){
        return TMB;

    }



}
