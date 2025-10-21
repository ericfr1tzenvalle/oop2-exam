package com.ericfr1tzenvalle.exam.exercise1.model;

import lombok.AllArgsConstructor;

import java.sql.SQLOutput;

@AllArgsConstructor
public class ArCondicionado {
    private Evaporadora evaporadora;
    private Condesadora condesadora;

    public void exec(){
        evaporadora.addObserver(condesadora);
        System.out.println("Condesadora em modo: " + condesadora.getStatus().name());


        // #test 1 verificar se a condesadora vai esfriar para chegar a temperatura desejada
        evaporadora.controleSetTemperatura(12);
        System.out.println("Condesadora em modo: " + condesadora.getStatus().name());
        System.out.println("Temperatura atual: " + evaporadora.getTemperaturaControle() + "°C");

        // #test 2 verificar se a condesadora vai esquentar para chegar a temperatura desejada
        evaporadora.controleSetTemperatura(25);
        System.out.println("Condesadora em modo: " + condesadora.getStatus().name());
        System.out.println("Temperatura atual: " + evaporadora.getTemperaturaControle() + "°C");






    }
}
