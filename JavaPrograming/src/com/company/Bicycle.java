package com.company;

public class Bicycle {

    String firmOfBicycle;
    String typeOfBicycle;
    String materialOfBicycle;
    String colorOfBicycle;
    Float priceOfBicycle;

    void newBicycle(String newFirm,String newType,String newMaterial, String newColor, Float newPrice)
    {
        firmOfBicycle = newFirm;
        typeOfBicycle = newType;
        materialOfBicycle = newMaterial;
        colorOfBicycle = newColor;
        priceOfBicycle = newPrice;
    }

    void showInfoAboutBicycle()
    {
        System.out.printf("Firm: %s\nType: %s\nMaterial: %s\nColor: %s\nPrice: %s",firmOfBicycle,typeOfBicycle,materialOfBicycle,colorOfBicycle,priceOfBicycle);
        System.out.println("\n________________");
    }


}
