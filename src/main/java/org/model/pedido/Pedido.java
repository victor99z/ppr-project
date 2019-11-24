package org.model.pedido;

import org.model.pedido.Pagamento;
import org.model.produto.Produto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private String clienteCpf;
    private Map<String,Integer> itens;
    private Double valorTotal;
    private String data;
    private Pagamento metodoPag;
    private Boolean statusPag;

    @Override
    public String toString() {
        return "Pedido{" +
                "clienteCpf='" + clienteCpf + '\'' +
                ", itens=" + itens +
                ", valorTotal=" + valorTotal +
                ", data='" + data + '\'' +
                ", metodoPag=" + metodoPag +
                ", statusPag=" + statusPag +
                "}";
    }
}
