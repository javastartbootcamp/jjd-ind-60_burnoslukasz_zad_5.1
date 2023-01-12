package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        scanner.nextLine();
        if (x > 0 && y > 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w I ćwiartce układu współrzędnych");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w II ćwiartce układu współrzędnych");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w III ćwiartce układu współrzędnych");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w IV ćwiartce układu współrzędnych");
        } else if (x == 0 && y < 0 || y > 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w na osi Y układu współrzędnych");
        } else if (x > 0 || x < 0 && y == 0) {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży w na osi X układu współrzędnych");
        } else {
            System.out.println("Punkt " + "(" + x + ", " + y + ")" + " leży na srodku układu współrzędnych");

        }
    }

}



