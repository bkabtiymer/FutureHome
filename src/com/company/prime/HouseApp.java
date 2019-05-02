package com.company.prime;

public class HouseApp {

    public static void main(String[] args) {
        House present=new House();
//        Input values for each attribute of present house house
        present.setFloor(2);
        present.setWindow(10);
        present.setDoor(3);
        present.setFootage(2000);
        present.setPrice(30000);

        present.getDisplayText();
//        Input values for each attribute of future house house
        House future=new House();
        present.setFloor(3);
        present.setWindow(20);
        present.setDoor(5);
        present.setFootage(20000);
        present.setPrice(300000);

        present.getDisplayText2();

    }
}
