package org.model.pedido;

import java.util.Map;

public class Pedido {
    private String clienteCpf;
    private Map<String,Integer> itens;
    private Double valorTotal;
    private String data;
    private EnumPagamento metodoPag;
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
