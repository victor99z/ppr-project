package org;

import org.model.produto.*;


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

        */


        Produto p1 = new Produto();
        p1.setIngredientes(new Ingrediente("Cenoura"), 20);
        p1.setIngredientes(new Ingrediente("Chocolate"),4);
        p1.setIngredientes(new Ingrediente("Ervilha"), 3);
        System.out.println(p1.getIngredientes().toString());





    }
}
