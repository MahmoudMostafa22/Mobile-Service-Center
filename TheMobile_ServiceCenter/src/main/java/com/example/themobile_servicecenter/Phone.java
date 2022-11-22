package com.example.themobile_servicecenter;

import java.util.*;
public class Phone extends Product{
    String phone_name;//receipt


    public Phone( String color, Date release_date, String manufacturing_company, String os, float software_version, String phone_name) {
        super( color, release_date, manufacturing_company, os, software_version);
        this.phone_name = phone_name;
    }

    public double get_phoneprice(){
        if(manufacturing_company == "apple"){
            return 650.0;
        }
        else if(manufacturing_company == "samsung"){
            return 600.0;
        }
        else if(manufacturing_company == "huawei"){
            return 550.0;
        }
        else if(manufacturing_company == "google"){
            return 500.0;
        }
        else if(manufacturing_company == "oppo"){
            return 450.0;
        }
        else if(manufacturing_company == "one plus"){
            return 400.0;
        }
        else{
            return 200.0;
        }
    }

    @Override
    public double getprice() {
       return (price + get_phoneprice());
    }
    public void replace(Phone x,Phone y){
        if(x.getprice() > y.getprice()){
            price = price - (x.getprice() - y.getprice());
        }else if(x.getprice() > y.getprice()){
            price = price - (x.getprice() + y.getprice());
        }
    }
}
