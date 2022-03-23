package com;

public class Hosteller extends Student{
private int no_of_hrs;

    public int getNo_of_hrs() {
        return no_of_hrs;
    }

    public void setNo_of_hrs(int no_of_hrs) {
        this.no_of_hrs = no_of_hrs;
    }

    public Hosteller(int id, String name, int no_of_hrs) {
        super(id, name);
        this.no_of_hrs = no_of_hrs;
    }
}
