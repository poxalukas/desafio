package com.dio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dataInicial= LocalDate.now();
    private final LocalDate dataFinal= dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet <>();

    public Bootcamp() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null || getClass() != obj.getClass()) return false;
        Bootcamp bootcamp= (Bootcamp) obj;
        return Objects.equals(name,bootcamp.name)&& Objects.equals(description, bootcamp.description) && Objects.equals(dataInicial, bootcamp.dataInicial)&& Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
