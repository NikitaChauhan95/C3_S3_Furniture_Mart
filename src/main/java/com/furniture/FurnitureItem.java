/*
 *Author Name: Nikita Chauhan
 *Date: 26-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.furniture;

public class FurnitureItem {

    static final int DISCOUNT = 5;
    private int furnitureCode;
    private String furnitureType;
    private int gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;

    public FurnitureItem() {
    }

    public FurnitureItem(int furnitureCode, String furnitureType, int gradeOfFurniture, String color, String furnitureUsage, double price) {
        this.furnitureCode = furnitureCode;
        this.furnitureType = furnitureType;
        this.gradeOfFurniture = gradeOfFurniture;
        this.color = color;
        this.furnitureUsage = furnitureUsage;
        this.price = price;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public int getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(int gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float calculateDiscount() {
        float discountedPrice = 0.0f;
        if ("OUTDOOR".equals(furnitureType)) {
            discountedPrice = (float) (price - price * 0.05);
        } else {
            discountedPrice = (float) price;
        }
        return discountedPrice;

    }

    void displayDetails() {
        System.out.println(furnitureCode);
        System.out.println(furnitureType);
        System.out.println(gradeOfFurniture);
        System.out.println(color);
        System.out.println(furnitureUsage);
        System.out.println(price);

    }

}
