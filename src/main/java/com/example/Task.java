package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите курс доллара");
            double a=scan.nextDouble();
           System.out.println("Введите сумму в рублях");
            scan = new Scanner(System.in);
            double b=scan.nextDouble();
            double value=b/a;
            System.out.println("Итого: "+ String.format("%.2f",value) +" долларов");
        }
}
