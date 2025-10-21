package com.ericfr1tzenvalle.exam.exercise2.model;

import java.util.List;

public class RelatorioHTML extends Relatorio{
    public RelatorioHTML(String titulo, String data) {
        super(titulo, data);
    }

    @Override
    public String gerar(List<Venda> vendas) {
        StringBuilder sb = new StringBuilder("<html>\n" +
                "<head><title>" + getTitulo() + "<title>" + "</head>\n" +
                "<body>\n" +
                "<h1>" + getTitulo() + "</h1>\n" +
                "<p>" + getData() + "</p>\n" +
                "<table border=\"1\">\n>" +
                "<tr><th>Produto</th><th>Quantidade</th><th>Preço</th></tr>\n");
        for(Venda v : vendas){
            sb.append("<tr><td>").append(v.getProdutoNome()).append("</td><td>").append(v.getQuantidade()).append("</td><td>R$ ").append(v.getPrecoUnit()).append("</td></tr>\n");
        }
        sb.append("</table>\n" +
                "</body></html>");
        return sb.toString();
    }
}
