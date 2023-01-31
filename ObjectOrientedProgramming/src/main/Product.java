package main;

import java.util.Scanner;

public class Product {

    String name;
    float price;

    Product(String name, float price){
        this.name = name;
        this.price = price;

        System.out.println("Product Created! ");
        System.out.println(name);
        System.out.println("PHP " + price);
    }
}
