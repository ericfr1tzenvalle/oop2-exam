package com.ericfr1tzenvalle.exam.exercise2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Venda {
    private String produtoNome;
    private int quantidade;
    private double precoUnit;


}
