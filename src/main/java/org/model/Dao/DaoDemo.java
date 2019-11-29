package org.model.Dao;


import org.model.usuario.EnumUsuarios;
import org.model.usuario.UserDaoImpl;
import org.model.usuario.UsuariosImpl;

public class DaoDemo {
    public static void main(String[] args) {

        UserDaoImpl u1 = new UserDaoImpl();
        UsuariosImpl user1 = new UsuariosImpl();
        user1.setCpf("11410506924");
        user1.setNome("fodase");
        user1.setTipo(EnumUsuarios.CLIENTE);

        u1.removeUser("11510609835");

    }
}
