package com.swed_homework;

import java.util.ArrayList;
import java.util.List;

public class Subscription implements Observer{
    private Integer id;
    private Integer frequency;
    private Channel communicationChannel;

    private Website website;
    private List<Notification> notifications = new ArrayList<>();

    public void update() {
        Notification notif = new Notification();
        notif.setText("Website " + website.getUrl() + " was just updated");
        notifications.add(notif);
        notif.sendNotification();
    }

    public Website getWebsite(){
        return website;
    }

    public void setWebsite(Website website){
        if (this.website != null) {
            this.website.detach(this);
        }
        this.website = website;
        this.website.attach(this);
    }

    public List<Notification> getNotification() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public void addNotifications(Notification notifications) {
        this.notifications.add(notifications);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public void changeFrequency(Integer freq) {
        this.frequency = freq;
    }

    public Channel getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(Channel communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public void changeChannel(Channel channel) {
        this.communicationChannel = channel;
    }
    

}
