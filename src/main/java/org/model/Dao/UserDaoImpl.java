package org.model.Dao;

import com.google.gson.Gson;
import org.model.usuario.ListaUsuarios;
import org.model.usuario.UsuariosImpl;
import java.io.*;


public class UserDaoImpl implements UserDao {
    ListaUsuarios c1;

    @Override
    public void removeUser(String cpf) {
        LoadUsers();
        c1.removeUser(cpf);
    }

    @Override
    public void LoadUsers() {

        try {
            Gson gson = new Gson();
            c1 = gson.fromJson(new FileReader("src/main/Database/Usuarios.json"), ListaUsuarios.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ListaUsuarios getUsers() {
        return c1;
    }

    public void WriteUsers(){
        try{
            Gson gson = new Gson();
            String text = gson.toJson(c1);
            FileWriter fw = new FileWriter("src/main/Database/Usuarios.json");
            fw.write(text);
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setUsers(UsuariosImpl user) {
        LoadUsers();
        c1.setUsuarios(user);
        WriteUsers();
    }
}
