package org.model.pedido;

import org.model.produto.Produto;
import org.model.usuario.Cliente;

import java.util.Calendar;
import java.util.HashMap;

public class Pedido {
    private Cliente cliente;
    private HashMap<Produto, Integer> itens;
    private Pagamento pag;
    private Calendar dt;
    private Boolean status;

    public void gerarCupom(){

    }

}
