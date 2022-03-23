package com;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Hstu_Third")
@PrimaryKeyJoinColumn(name = "id")
public class Hosteller extends Student{
private int no_of_hrs;

    public int getNo_of_hrs() {
        return no_of_hrs;
    }

    public void setNo_of_hrs(int no_of_hrs) {
        this.no_of_hrs = no_of_hrs;
    }

}
