package org.model.usuario;

public class UsuariosImpl {
    private String cpf;
    private String nome;
    private EnumUsuarios tipo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumUsuarios getTipo() {
        return tipo;
    }

    public void setTipo(EnumUsuarios tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "UsuariosImpl{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
