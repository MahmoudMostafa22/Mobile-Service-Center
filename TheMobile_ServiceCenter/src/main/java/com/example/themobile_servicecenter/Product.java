package com.example.themobile_servicecenter;

import java.util.Date;

public class Product {

    String NameOfPart;
    Date release_date;
    String manufacturing_company;//determine price sell/replace/estimated repair time or price of repair(hardware)
    String os;// determine price/estimated time (software)
    float software_version;// software
    public static double price;//receipt

    public Product() {
    }

    public Product(String nameOfPart, Date release_date, String manufacturing_company, String os, float software_version) {
        this.NameOfPart = nameOfPart;
        this.release_date = release_date;
        this.manufacturing_company = manufacturing_company;
        this.os = os;
        this.software_version = software_version;
    }

    public double getprice(){
        return 100;
    };
}
