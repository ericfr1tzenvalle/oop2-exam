package com.ericfr1tzenvalle.exam.exercise2.model;

import java.util.List;

public class RelatorioPDF extends Relatorio {

    public RelatorioPDF(String titulo, String data) {
        super(titulo, data);
    }

    @Override
    public String gerar(List<Venda> vendas) {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ").append(getTitulo()).append(" =====\n");
        sb.append("Data: ").append(getData()).append("\n");
        sb.append("--------------------------------------\n");
        sb.append(String.format("%-18s %-8s %-10s\n", "Produto", "Qtde", "Preço"));

        for (Venda v : vendas) {
            sb.append(String.format("%-18s %-8d R$ %-10.2f\n",
                    v.getProdutoNome(),
                    v.getQuantidade(),
                    v.getPrecoUnit()));
        }

        sb.append("--------------------------------------\n");
        return sb.toString();
    }
}
