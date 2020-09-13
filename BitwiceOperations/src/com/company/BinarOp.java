package com.company;
import java.util.Scanner;
public class BinarOp {
     static void main() {
         int a, b, c, d;
         Scanner in = new Scanner(System.in);

         System.out.println("Введите 4 переменных");
         a = in.nextInt();
         b = in.nextInt();
         c = in.nextInt();
         d = in.nextInt();
         System.out.println("");

         System.out.println("& (побитовое и) :");
         System.out.println(a + " & "+ b+" = " + (a & b));
         System.out.println(c + " & "+ d+" = " + (a & d));
         System.out.println("");

         System.out.println("| (побитовое или):");
         System.out.println(a + " | "+ b+" = " + (a | b));
         System.out.println(c + " | "+ d+" = " + (a | d));
         System.out.println("");

         System.out.println("^ (побитовое логическое или):");
         System.out.println(a + " ^ "+ b+" = " + (a ^ b));
         System.out.println(c + " ^ "+ d+" = " + (a ^ d));
         System.out.println("");

         System.out.println("~ (побитовое дополнение)");
         System.out.println(" ~ "+a +" = "+ ~a);
         System.out.println(" ~ "+b +" = "+ ~b);
         System.out.println(" ~ "+c +" = "+ ~c);
         System.out.println(" ~ "+d +" = "+ ~d);
         System.out.println("");

         System.out.println("<< (сдвиг влево):");
         System.out.println(a +"<<2 "+" = "+ (a<<2));
         System.out.println(b +"<<2 "+" = "+ (b<<2));
         System.out.println(c +"<<2 "+" = "+ (c<<2));
         System.out.println(d +"<<2 "+" = "+ (d<<2));
         System.out.println("");

         System.out.println(">> (сдвиг вправо):");
         System.out.println(a +">>2 "+" = "+ (a>>2));
         System.out.println(b +">>2 "+" = "+ (b>>2));
         System.out.println(c +">>2 "+" = "+ (c>>2));
         System.out.println(d +">>2 "+" = "+ (d>>2));
         System.out.println("");

         System.out.println(">> (нулевой сдвиг вправо):");
         System.out.println(a +">>>2 "+" = "+ (a>>2));
         System.out.println(b +">>>2 "+" = "+ (b>>2));
         System.out.println(c +">>>2 "+" = "+ (c>>2));
         System.out.println(d +">>>2 "+" = "+ (d>>2));
         System.out.println("");

     }
}
