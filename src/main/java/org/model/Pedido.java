package org.model;

import java.time.LocalDate;
import java.util.HashMap;

public class Pedido {
    private Cliente cliente;
    private HashMap<Produto, Integer> itens;
    private Pagamento pag;
    private LocalDate dt;
    private Boolean status;

    public void gerarCupom(){

    }

}
