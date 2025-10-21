package com.ericfr1tzenvalle.exam.exercise2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class EmissaoRelatorios {
    public void exec(){
        ArrayList<Venda> vendas = new ArrayList<>(Arrays.asList(
                new Venda("Camisa Polo", 3, 150.00),
                new Venda("Calça Jeans", 1, 120.00),
                new Venda("Tênis Esportivo", 2, 300.00)
        ));
        System.out.println("Relatório HTML");
        RelatorioCreator rcHTML = new CreatorHTML();
        Relatorio rHTML = rcHTML.criarRelatorio("Relatório de Vendas", "10/10/2025");
        System.out.println(rHTML.gerar(vendas));

        System.out.println("\nRelatório PDF");
        RelatorioCreator rcPDF = new CreatorPDF();
        Relatorio rPDF = rcPDF.criarRelatorio("Relatório de Vendas", "10/10/2025");
        System.out.println(rPDF.gerar(vendas));

        System.out.println("\nRelatório CSV");
        RelatorioCreator rcCSV = new CreatorCSV();
        Relatorio rCSV = rcCSV.criarRelatorio("Relatório de Vendas", "10/10/2025");
        System.out.println(rCSV.gerar(vendas));



    }
}
