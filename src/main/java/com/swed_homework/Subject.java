package com.swed_homework;

public interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}
