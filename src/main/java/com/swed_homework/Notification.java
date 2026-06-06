package com.swed_homework;

import java.sql.Time;
import java.util.Date;

public class Notification {
    private Integer id;
    private Date date;
    private Time time;
    private String text;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean sendNotification() {
        if (this.text != null){
            System.out.println("Sending mesage : " + this.text);
            return true;
        }
        return false;
    }
}
