package org;

import com.google.gson.*;
import org.model.pedido.ListaPedidos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainDemo {
    public static void main(String[] args) {
        /*

        cliente();
        criarPedido();
        realizarPagamento();

        gestor()
        consultas()
        cancelamento de pedidos()



        UserFactory users = new UserFactory();
        Usuario c1 = users.createUser(ListaUsuarios.CLIENTE);
        Usuario f1 = users.createUser(ListaUsuarios.FUNCIONARIO);
        Usuario g1 = users.createUser(ListaUsuarios.GESTOR);

        c1.setNome("Roberto");
        f1.setNome("pimpau");
        g1.setNome("nois");

        System.out.println(c1.getNome());
        System.out.println(f1.getNome());
        System.out.println(g1.getNome());




        Produto p1 = new Produto();
        p1.setIngredientes(new Ingrediente("Cenoura"), 20);
        p1.setIngredientes(new Ingrediente("Chocolate"),4);
        p1.setIngredientes(new Ingrediente("Ervilha"), 3);
        System.out.println(p1.getIngredientes().toString());


        Gson gson = new Gson();

        try {
            ListaPedidos p1 = gson.fromJson(new FileReader("src/main/Database/Pedidos.json"), ListaPedidos.class);
            System.out.println(p1.totalPedidos());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */

        Gson gson = new Gson();

        try {
            Object user = gson.fromJson(new FileReader("src/main/Database/Usuarios.json"), Object.class);
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
