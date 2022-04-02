package com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataDeInicio;

    public Mentoria() {
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo: "+getTitulo()+"\n"+
                "descricao: "+getDescricao()+"\n"+
                "data de início: "+getDataDeInicio()+"\n"+
                "}";
    }
}