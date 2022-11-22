package com.example.themobile_servicecenter;

import java.util.Date;

public class Customer extends Person{
    private String Device;
    private String Problem;
    private int operation_id;
    private String Operation;

    public Customer() {}// needs to be changed when used

    public Customer(String name, int age, int phoneNumber, int OPID, String problem, String device) {
        super(name,age,phoneNumber);
        this.operation_id = OPID;
        this.Device = device;
        this.Problem = problem;
    }
    public String getDevice() {
        return Device;
    }

    public void setDevice(String device) {
        Device = device;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {//choose from Database
        Problem = problem;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {//set from Database
        Operation = operation;
    }

    public String StateOperation(){
        //choose operation for customer
        return Operation;
    }


}

