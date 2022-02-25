package com.company;

public class Car implements AutoCloseable{

    private String model;
    private int year;

    public Car(String model,int year){
        this.model = model;
        this.year = year;
    }
    public  Car(){}

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }


    @Override
    public void close() throws Exception {
        System.out.println(model +  " Машина жабылып жатат");
    }
    public void drive(){
        System.out.println(model + " Машина журуп жатат");
    }
}
