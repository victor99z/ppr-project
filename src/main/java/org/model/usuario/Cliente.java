package org.model.usuario;

import org.model.Dao.Usuario;

public class Cliente implements Usuario {

    private String cpf;
    private String nome;
    private String tipo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
