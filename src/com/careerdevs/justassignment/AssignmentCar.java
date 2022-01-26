package com.careerdevs.justassignment;

public class AssignmentCar {

    private String make;
    private String model;
    private boolean isRented;

    public AssignmentCar(String make, String model, boolean isRented) {

        this.make = make;
        this.model = model;
        this.isRented = isRented;

        


    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName(){
        return make + " " + model;
    }
    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

}