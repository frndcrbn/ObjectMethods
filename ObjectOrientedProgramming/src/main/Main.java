package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Karrie","Irving", "2022", "BSCSSE", "Magaling", 90.03f, 85.12f);
        s.introducedSelf();
        s.evaluateGrade();
    }

}
