package com.example.themobile_servicecenter;

public class Receipt {

    Error x = new Error();
    Customer y = new Customer();
    Product z = new Product();
    public Receipt(Customer A,Error B,Product C) {
        this.y = A;
        this.x = B;
        this.z = C;
    }
    @Override
    public String toString() {
        return "components of receipt";
        //get name,Age,Phonenumber,Errortype, }
    }
}