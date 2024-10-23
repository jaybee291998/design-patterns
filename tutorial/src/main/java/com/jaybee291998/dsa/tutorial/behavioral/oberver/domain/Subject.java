package com.jaybee291998.dsa.tutorial.behavioral.oberver.domain;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
