package com.ericfr1tzenvalle.exam.exercise2.model;

public class CreatorHTML implements RelatorioCreator{
    @Override
    public Relatorio criarRelatorio(String titulo, String data) {
        return new RelatorioHTML(titulo,data);
    }



}
