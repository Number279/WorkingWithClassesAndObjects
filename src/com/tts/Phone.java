package com.tts;

public class Phone {
    private int cost;
    private String name;
    private String os;
    private boolean ringing;

    //empty constructor
    public Phone(){ };

    public Phone(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public boolean isRinging() {
        return ringing;
    }

    public void setRinging(boolean ringing) {
        this.ringing = ringing;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
