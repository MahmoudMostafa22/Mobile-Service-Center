package com.example.themobile_servicecenter;

import java.util.Date;

public class Accessories extends Product {
    String accessory_name;//receipt

    public Accessories(String color, Date release_date, String manufacturing_company, String os, float software_version, String accessory_name) {
        super(color, release_date, manufacturing_company, os, software_version);
        this.accessory_name = accessory_name;
    }

    public double get_accprice() {
        if (manufacturing_company == "anker") {
            return 80;
        } else if (manufacturing_company == "sony") {
            return 90;
        } else if (manufacturing_company == "baseus") {
            return 60;
        } else {
            return 50;
        }
    }

    @Override
    public double getprice() {

        return (price + get_accprice());
    }


    public void replace(Accessories x, Accessories y) {
        if (x.getprice() > y.getprice()) {
            price = price - (x.getprice() - y.getprice());
        } else if (x.getprice() > y.getprice()) {
            price = price - (x.getprice() + y.getprice());
        }
    }
}
