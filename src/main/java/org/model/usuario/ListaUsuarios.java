package org.model.usuario;

import org.model.Dao.UserDaoImpl;

import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList<UsuariosImpl> usuarios;

    public int getTotalUser(){
        return usuarios.size();
    }

    public UsuariosImpl getUsuario(String cpf){
        for(UsuariosImpl in: usuarios){
            if(in.getCpf().equals(cpf)){
                return in;
            }
        }
        return null;
    }

    public void removeUser(String cpf){
        for (UsuariosImpl i: usuarios){
            if(i.getCpf().equals(cpf)){
                usuarios.remove(i);
            }
        }
        System.out.println(usuarios);
    }

    public void setUsuarios(UsuariosImpl user){
        usuarios.add(user);
    }

    @Override
    public String toString() {
        return "ListaUsuarios{" +
                "usuarios=" + usuarios +
                '}';
    }
}
