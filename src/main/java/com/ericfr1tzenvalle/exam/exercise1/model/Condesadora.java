package com.ericfr1tzenvalle.exam.exercise1.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Condesadora implements Observer{
    //no uml original é enviado por update(Subject).
    private Subject subject;
    //no uml original é emOperacao que retorna double.
    private Modo status;

    public Condesadora(){
        this.status = Modo.STAND_BY;
    }
    @Override
    public void update() {
        if(this.subject != null && subject instanceof Evaporadora e){
            double temperaturaAmbiente = (double) e.getUpdate();
            System.out.println("Temperatura ambiente: " + temperaturaAmbiente + "°C");
            System.out.println("Temperatura desejada: " + e.getTemperaturaControle() + "°C");
            if(e.getTemperaturaControle() > temperaturaAmbiente){
                System.out.println("Temperatura desejada maior: Esquentando...");
                this.status = Modo.ESQUENTANDO;
            }else if(e.getTemperaturaControle() < temperaturaAmbiente){
                System.out.println("Temperatura desejada menor: Resfriando...");
                this.status = Modo.ESFRIANDO;
            }else{
                this.status = Modo.STAND_BY;
            }
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;

    }
}
