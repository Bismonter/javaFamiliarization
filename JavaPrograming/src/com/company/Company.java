package com.company;

public class Company {
    public static void  main(String[] args)
    {
        Bicycle firstBicycle = new Bicycle();
        firstBicycle.newBicycle("CrossBike","Mountain","Aluminium","Green",3680f );

        Bicycle secondBicycle = new Bicycle();
        secondBicycle.newBicycle("Ardis X-Cross","Mountain","Aluminium","Gray",2648f );

        System.out.println("________________");
        System.out.println("    First bicycle:");
        firstBicycle.showInfoAboutBicycle();

        System.out.println("    Second bicycle:");
        secondBicycle.showInfoAboutBicycle();


    }
}
