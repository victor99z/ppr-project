package org.model.produto;

public class Ingrediente {

    private String nome;

    public Ingrediente(String nome){
        setNome(nome);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
