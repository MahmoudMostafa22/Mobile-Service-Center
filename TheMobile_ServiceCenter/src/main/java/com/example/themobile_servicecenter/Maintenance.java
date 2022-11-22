package com.example.themobile_servicecenter;

public interface Maintenance {
    Error problem = null;
    String ErrorSolution = null;
    Product device = null;
    public Boolean IsFixed();
    public Boolean Fixable();
}