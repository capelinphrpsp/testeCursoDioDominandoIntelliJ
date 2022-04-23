package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private byte idade;

    public Gato() {
    }

    public Gato(String nome, String cor, byte idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        final boolean retorno;

        if (this == o)
            retorno = true;
        else if (o == null || getClass() != o.getClass())
            retorno = false;
        else {
            final Gato gato = (Gato) o;
            retorno = this.idade == gato.idade &&
                    Objects.equals(this.nome, gato.nome) &&
                    Objects.equals(this.cor, gato.cor);
        }

        return retorno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + Byte.toString(idade) +
                '}';
    }
}