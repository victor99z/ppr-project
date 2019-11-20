package org.model;

import java.util.ArrayList;

public class Gestor extends Funcionario{

    public boolean CadastrarProduto(Produto p){
        return true; // Implementar DAO com o write no json
    }
    public boolean CadastrarIngrediente(Ingrediente i){
        return true; // Implementar DAO com o write no json
    }
    public Integer consultaPedidosPagosHoje(){
        return 10; // implementar depois
    }
    public Integer consultaPedidosPagosMes(){
        // TODO: 08/11/2019
        return 1000;
    }
    public Integer consultaPedidosCanceladosHoje(){
        // TODO: 08/11/2019
        return 5;
    }
    public Integer consultaPedidosCanceladosMes(){
        return 11;
    }

}
