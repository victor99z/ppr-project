package org.model.pedido;

import org.model.pedido.Pedido;

import java.util.List;

public class ListaPedidos {
    private List<Pedido> ListaPedidos;

    public Integer totalPedidos(){
        return ListaPedidos.size();
    }

    @Override
    public String toString() {
        return ""+ListaPedidos;
    }
}
