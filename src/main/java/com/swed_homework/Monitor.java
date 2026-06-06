package com.swed_homework;

import java.util.ArrayList;
import java.util.List;

public class Monitor {
    private boolean isActive;
    private List<Subscription> subscriptions = new ArrayList<>();

    public Monitor(Subscription subscription) {
        this.subscriptions.add(subscription);
    }   

    public boolean getStatus() {
        return isActive;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void addSubscription(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    public void setStatus(boolean active) {
        this.isActive = active;
    }

    public boolean checkSubscriptions() {
        if (subscriptions.isEmpty()) {
            return false;
        }
        for (Subscription subsc : subscriptions) {
                if (subsc.getWebsite().isActive()) {                
                    return true;
            }
        }
        return false;
    }
}
