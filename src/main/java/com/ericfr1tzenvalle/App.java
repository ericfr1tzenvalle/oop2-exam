package com.ericfr1tzenvalle;

import com.ericfr1tzenvalle.exam.exercise1.model.*;
import com.ericfr1tzenvalle.exam.exercise2.model.EmissaoRelatorios;

public class App {
    public static void main(String[] args) {
        //Exercício 1
        //ArCondicionado ar = new ArCondicionado(new Evaporadora(new SensorTemperatura(22), new ControleRemoto(22)),new Condesadora());
        //ar.exec();

        //Exercício 2
        EmissaoRelatorios em = new EmissaoRelatorios();
        em.exec();

    }
}