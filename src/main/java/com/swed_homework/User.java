package com.swed_homework;

import java.util.ArrayList;
import java.util.List;


public class User {
    private Integer id;
    private String name;
    private String emailAddress;
    private String birthDate;

    private List<Subscription> subscriptions = new ArrayList<>();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public boolean addSubscription(Subscription subscription) {
        return this.subscriptions.add(subscription);
    }

    public boolean removeSubscription(Integer subscriptionId) {
        for (Subscription s : subscriptions) {
            if (s.getId().equals(subscriptionId)) {                
                return subscriptions.remove(s);
            }
        }
        return false;
    }

}
