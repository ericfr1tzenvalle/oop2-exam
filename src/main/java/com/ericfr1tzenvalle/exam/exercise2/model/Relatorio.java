package com.ericfr1tzenvalle.exam.exercise2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
public abstract class Relatorio {
    private String titulo;
    private String data;

    public abstract String gerar(List<Venda> vendas);
}
