package com.company.prime;

//Attributes objects of classes
public class House {
    private int floor=0;
    private int window=0;
    private int door=0;
    private double footage=0;
    private double price=0;

    public House(int floor2, int window2, double footage2, double price2){
        floor=floor2;
        window=window2;
        footage=footage2;
        price=price2;
    }
//Assign getters and setter for the attributes
    public House() {

    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getFloor() {
        return floor;

    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public double getFootage() {
        return footage;
    }

    public void setFootage(double footage) {
        this.footage = footage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//    Create a method that will pull information from the setters
    public void getDisplayText(){
        System.out.printf("My present home has %d floors, %d windows, and %d doors. It is worth %f.\n",getFloor(),getWindow(),getDoor(),getPrice());
    }
    public void getDisplayText2(){
        System.out.printf("My future home has %d floors, %d windows, and %d doors. It is worth %f.",getFloor(),getWindow(),getDoor(),getPrice());
    }
}
