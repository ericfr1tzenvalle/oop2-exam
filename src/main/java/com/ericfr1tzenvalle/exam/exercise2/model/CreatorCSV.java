package com.ericfr1tzenvalle.exam.exercise2.model;

public class CreatorCSV implements RelatorioCreator{
    @Override
    public Relatorio criarRelatorio(String titulo, String data) {
        return new RelatorioCSV(titulo,data);
    }
}
