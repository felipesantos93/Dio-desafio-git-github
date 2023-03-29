package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome, descricao;
    private final LocalDate dataincial = LocalDate.now();
    private final LocalDate  datafinal = dataincial.plusDays(45);
    private Set<Dev> devinscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataincial() {
        return dataincial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<Dev> getDevinscritos() {
        return devinscritos;
    }

    public void setDevinscritos(Set<Dev> devinscritos) {
        this.devinscritos = devinscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataincial, bootCamp.dataincial) && Objects.equals(datafinal, bootCamp.datafinal) && Objects.equals(devinscritos, bootCamp.devinscritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataincial, datafinal, devinscritos, conteudos);
    }
}
