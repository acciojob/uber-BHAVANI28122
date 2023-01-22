package com.driver.model;

import javax.persistence.*;

public class Cab{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cabId;

    private int perKmRate;

    private boolean available;

    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }
    public Cab(){

    }


    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}