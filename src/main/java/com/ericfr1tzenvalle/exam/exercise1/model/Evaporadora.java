package com.ericfr1tzenvalle.exam.exercise1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Evaporadora implements Subject {
    private List<Observer> observers;
    private SensorTemperatura sensor;
    private ControleRemoto controle;
    private static final double EPSILON = 0.01; // tolerância para comparação de double ou seja se a diferença for
    //menor de 0.1 consideramos igual

    public Evaporadora(SensorTemperatura sensor, ControleRemoto controle){
        this.sensor = sensor;
        this.controle = controle;
        this.observers = new ArrayList<>();
    }

    public void sensorSetTemperatura(double temperatura){
        sensor.setTemperatura(temperatura);
        //se a temperatura ambiente mudar e ela for diferente da desejada chamamos os observers
        verificarTemperatura();
    }
    public void controleSetTemperatura(double temperatura){
        controle.setTemperatura(temperatura);
        //se a temperatura atual (sensor)  é diferente da temperatura desejada (controle) acionamos os observers
        verificarTemperatura();
    }

    public void verificarTemperatura(){
        if(Math.abs(controle.getTemperatura() - sensor.getTemperatura()) > EPSILON){
            notifyObservers();
        }
    }


    public double getTemperaturaControle(){
        return controle.getTemperatura();
    }

    public double getTemperaturaSensor(){
        return sensor.getTemperatura();
    }

    @Override
    public void addObserver(Observer s) {
        if(s != null && !observers.contains(s)){
            s.setSubject(this);
            observers.add(s);

        }

    }

    @Override
    public void removeObserver(Observer s) {
        if(s != null && observers.contains(s)){
            observers.remove(s);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }

    }

    @Override
    public Object getUpdate() {
        return sensor.getTemperatura();
    }
}
