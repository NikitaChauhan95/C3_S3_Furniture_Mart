/*
 *Author Name: Nikita Chauhan
 *Date: 26-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.furniture;

public class FurnitureItemImpl {

    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem(101, "Table", 1, "RED", "OUTDOOR", 4500);

        furnitureItem.setFurnitureCode(101);
        furnitureItem.setFurnitureUsage("OUTDOOR");
        furnitureItem.setGradeOfFurniture(1);
        furnitureItem.setColor("RED");
        furnitureItem.setFurnitureType("Table");
        furnitureItem.setPrice(230.0);

        furnitureItem.getFurnitureCode();
        furnitureItem.getFurnitureType();
        furnitureItem.getFurnitureUsage();
        furnitureItem.getGradeOfFurniture();
        furnitureItem.getColor();
        furnitureItem.getPrice();

        furnitureItem.calculateDiscount();


        furnitureItem.displayDetails();

    }

}

