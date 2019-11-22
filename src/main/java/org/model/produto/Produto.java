package org.model.produto;

import java.util.HashMap;

public class Produto {
    private String nome;
    private Integer id;
    private HashMap<Ingrediente, Integer> ingredientes = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Ingrediente,Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente ingrediente, int qtd) {
        this.ingredientes.put(ingrediente, qtd);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
