package ru.geekbrains.lesson_one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

// Ex3
        System.out.print("5 = ");
        positive_negative(5);
        System.out.print("-5 = ");
        positive_negative(-5);
//Ex4
        printHello("Liza");
//Ex5
        leap_year();
    }
//ex 1
    private static float calculation_one(int a, int b, int c, int d) {
        return a * (b + (float) c / d);
    }

//ex 2
private static boolean sum_between_10_20(int a, int b){
        if(a + b >= 10 && a + b <= 20){
            return true;
        } else {
            return false;
        }
    }

//ex 3
    private static void positive_negative(int a){
        if(a >= 0){
            System.out.println("Positive value");
        } else {
            System.out.println("Negative value");
        }
    }

 //ex 4
private static void printHello(String name){
        System.out.println("Hello, " + name + "!");
    }

//ex 5
    private static void leap_year(){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите год");
        int a = scanner.nextInt();
        if(a % 400 == 0){
            System.out.println("366 days in the year");
        } else if (a % 100 == 0){
            System.out.println("365 days in the year");
        } else if (a % 4 == 0){
            System.out.println("366 days in the year");
        } else {
            System.out.println("365 days in the year");
        }
    }
}