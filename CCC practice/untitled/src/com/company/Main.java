package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        CAT[] cat = new CAT[3];

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Type the name of the cat");
            String name = sc.next();

            //Scanner sc = new Scanner (System.in);
            System.out.print("Type the color of the cat");
            String color = sc.next();

            //Scanner sc = new Scanner (System.in);
            System.out.print("Type the weight of the cat");
            float weight = Float.parseFloat(sc.next());

            cat[i] = new CAT(name, color, weight);


        }
        for (int i = 0; i < 3; i++) {
            cat[i].ShowMyInfo();

        }
    }
}

