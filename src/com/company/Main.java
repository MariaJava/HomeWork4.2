package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bведите потраченную сумму");
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        do {
            System.out.println();
            int sum = Integer.parseInt(scanner.next());
            if (sum == 0) {
                status = false;
            }

            switch (sum) {
                case 202:
                    System.out.println("He хватает 2 грн");
                    break;
                case 200:
                    System.out.println("Ты счастливчик!");
                    break;
                case 100:
                    System.out.println("Пойди возьми еще что-то...");
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }
            System.out.println(sum);
        } while (status ) ;



    }

    }
