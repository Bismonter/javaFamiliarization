package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int ch = 1;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("_____Основное меню");
            System.out.println(" 1.Побитовые операции ");
            System.out.println(" 2.Работа с циклами ");
            System.out.println(" 0.Выход из цикла Do while");

            ch = in.nextInt();

            switch (ch)
            {
                case 1:
                {
                    BinarOp newBinar = new BinarOp();
                    newBinar.main();
                    break;
                }
                case 2:
                {
                    Cycle newCycle = new Cycle();
                    newCycle.main();
                    break;
                }
            }
        }while(ch!=0);
    }
}
