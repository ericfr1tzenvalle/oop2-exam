package com.ericfr1tzenvalle.exam.exercise1.model;

public interface Subject {
    void addObserver(Observer s);
    void removeObserver(Observer s);
    void notifyObservers();
    Object getUpdate();

}
