package com.swed_homework;

import java.util.ArrayList;
import java.util.List;

public class Website implements Subject{
    private String url;
    private boolean isActive;
    private String countryName;
    private String content;


    private List<Observer> obsList = new ArrayList<>();
    
    public void attach(Observer obs) {
        obsList.add(obs);
    }

    public void detach(Observer obs) {
        obsList.remove(obs);
    }

    public void notifyObservers() {
        for (Observer obs : obsList) {
            obs.update();
        }
    }

    public int getContentSize() {
        return content.length();
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
        notifyObservers();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
        notifyObservers();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
