package com.example.themobile_servicecenter;

class Hardware implements Maintenance {
    Error Problem ;
    Product Device ;
    String PartChanged ;

    public Hardware(Error problem, Product device) {
        this.Problem = problem;
        this.Device = device;
    }
    public void ChangePart(){
        // partchanged = part from products
        // function from class product
        Device = null;
    }

    public Boolean Fixable(){

        return false;
    }

    public Boolean IsFixed(){
        int x = (int)(Math.random() * 10);
        if (x>10)
            return true;
        return false;
    }
}