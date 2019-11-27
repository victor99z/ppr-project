package org.model.Dao;

import org.model.usuario.ListaUsuarios;
import org.model.usuario.UsuariosImpl;


public interface UserDao  {
    public void removeUser(String cpf);
    public void LoadUsers();
    public ListaUsuarios getUsers();
    public void setUsers(UsuariosImpl user);
    public void WriteUsers();
}
