package com.company;

public class Bicycle {
    String firmOfBicycle;
    String typeOfBicycle;
    String materialOfBicycle;
    String colorOfBicycle;
    Float priceOfBicycle;

    void newBicycle(String newFirm, String newType, String newMaterial, String newColor, Float newPrice) {
        this.firmOfBicycle = newFirm;
        this.typeOfBicycle = newType;
        this.materialOfBicycle = newMaterial;
        this.colorOfBicycle = newColor;
        this.priceOfBicycle = newPrice;
    }

    void showInfoAboutBicycle() {
        System.out.printf("Firm: %s\nType: %s\nMaterial: %s\nColor: %s\nPrice: %s", this.firmOfBicycle, this.typeOfBicycle, this.materialOfBicycle, this.colorOfBicycle, this.priceOfBicycle);
        System.out.println("\n________________");
    }
}
