package com;

public class DayScholar extends Student{

    private int vehicle,no_of_hrs;

    public DayScholar(int id,String name,int vehicle, int no_of_hrs) {
        super(id,name);
        this.vehicle = vehicle;
        this.no_of_hrs = no_of_hrs;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public int getNo_of_hrs() {
        return no_of_hrs;
    }

    public void setNo_of_hrs(int no_of_hrs) {
        this.no_of_hrs = no_of_hrs;
    }
}
