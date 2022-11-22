package com.example.themobile_servicecenter;

import java.util.Date;

public class laptop extends Product {
    String laptop_name;//receipt


    public laptop(String color, Date release_date, String manufacturing_company, String os, float software_version, String laptop_name) {
        super(color, release_date, manufacturing_company, os, software_version);
        this.laptop_name = laptop_name;
    }

    public double get_LaptopPrice() {
        if (manufacturing_company == "apple") {
            return 1000;
        } else if (manufacturing_company == "dell") {
            return 900;
        } else if (manufacturing_company == "hp") {
            return 800;
        } else if (manufacturing_company == "lenovo") {
            return 700;
        } else if (manufacturing_company == "asus") {
            return 600;
        } else if (manufacturing_company == "msi") {
            return 500;
        } else {
            return 200.0;
        }
    }

    @Override
    public double getprice() {

        return (price + get_LaptopPrice());
    }



    public void replace(laptop x, laptop y) {
        if (x.getprice() > y.getprice()) {
            price = price - (x.getprice() - y.getprice());
        } else if (x.getprice() > y.getprice()) {
            price = price - (x.getprice() + y.getprice());
        }
    }
}
