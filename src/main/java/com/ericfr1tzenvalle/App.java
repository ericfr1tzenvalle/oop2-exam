package com.ericfr1tzenvalle;

import com.ericfr1tzenvalle.exam.exercise1.model.*;

public class App {
    public static void main(String[] args) {
        //Exercício 1 da prova
        ArCondicionado ar = new ArCondicionado(new Evaporadora(new SensorTemperatura(22), new ControleRemoto(22)),new Condesadora());
        ar.exec();

    }
}