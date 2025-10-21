package com.ericfr1tzenvalle.exam.exercise2.model;

import java.util.List;

public class RelatorioCSV extends Relatorio{

    public RelatorioCSV(String titulo, String data) {
        super(titulo, data);
    }

    @Override
    public String gerar(List<Venda> vendas) {
        StringBuilder sb = new StringBuilder("Produto;Quantidade;PrecoTotal\n");
        for (Venda venda : vendas) {
            sb.append(venda.getProdutoNome()).append(";").append(venda.getQuantidade()).append(";").append(venda.getPrecoUnit()).append("\n");
        }
        return sb.toString();

    }
}
