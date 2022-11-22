package com.example.themobile_servicecenter;

class Software implements Maintenance {
    Error problem ;
    Product device ;
    String ErrorSolution ;

    public Software() {
    }

    public Software(Error x, Product y) {
        this.problem = x;
        this.device = y;
    }

    public String getErrorSolution() {
        //search for some default solutions and get them from a file and print it
        return ErrorSolution;

    }
    // for worker
    public Boolean Fixable(){
        //Search for it on the database sheet if found true else false
        return false;
    }

    public Boolean IsFixed(){
        int x = (int)(Math.random() * 10);
        if (x>5)
            return true;
        return false;
    }




}