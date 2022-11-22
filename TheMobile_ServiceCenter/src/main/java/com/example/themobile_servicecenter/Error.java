package com.example.themobile_servicecenter;

public class Error {
    String ErrorName ; //the problem
    String ErrorType ; //software or hardware

    public String getErrorName() {
        return ErrorName;
    }

    public void errorType(String ErrorName){
        if(ErrorName == "crushed" || ErrorName== "overheat" || ErrorName=="broke")//read from files
        {
            ErrorType ="Hardware";
            System.out.println("hardware error ");//invoke hardware
        }
        else
            System.out.println("software error");//invoke software
    }
}