package com.company;

import java.util.Scanner;
public class Cycle {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int ch;
        do {
            System.out.println("");
            System.out.println(" 1.Просмотр цикла for ");
            System.out.println(" 2.Просмотр улучшеного цикла for ");
            System.out.println(" 3.Просмотр цикла while");
            System.out.println(" 0.Выход из цикла Do while");
            ch = in.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println(" Конструкция цикла for : for(инициализация;условия;инкремент)");
                    System.out.print(" Сейчас на экран будет выведен прямоугольный треугольник");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++)
                            System.out.print("*");
                        System.out.println("");
                    }

                    break;
                }
                case 2: {
                    System.out.println(" Конструкция цикла улучшеного for : for(обхявление : выражение)");

                    String lit[] = {"Math", "Languages", "PE", "Literarture"};
                    for (String s : lit) {
                        if (s.indexOf('a') != -1) System.out.println(s + " Данное слово имеет букву A");
                    }
                    break;
                }
                case 3: {
                    System.out.println(" Конструкция цикла while(условие)");
                    int d = 0;
                    while (d != 1) {
                        System.out.println("Вы не выйдете из цикла пока не введете 1");
                        d = in.nextInt();
                    }

                    break;
                }
            }

        } while (ch != 0);
    }
}
