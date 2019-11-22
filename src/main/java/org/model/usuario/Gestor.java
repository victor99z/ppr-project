package org.model.usuario;

import org.model.produto.Ingrediente;
import org.model.produto.Produto;

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
        return 1000;
    }
    public Integer consultaPedidosCanceladosHoje(){
        return 5;
    }
    public Integer consultaPedidosCanceladosMes(){
        return 11;
    }

}
