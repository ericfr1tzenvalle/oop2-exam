package com.ericfr1tzenvalle.exam.exercise2.model;

public class CreatorPDF implements RelatorioCreator{
    @Override
    public Relatorio criarRelatorio(String titulo, String data) {
        return new RelatorioPDF(titulo,data);
    }
}
