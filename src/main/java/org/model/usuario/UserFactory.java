package org.model.usuario;

public class UserFactory {
    public Usuario createUser(EnumUsuarios user){
        switch (user){
            case CLIENTE: return new Cliente();
            case FUNCIONARIO: return new Funcionario();
            case GESTOR: return new Gestor();
            default: return null;
        }
    }
}
