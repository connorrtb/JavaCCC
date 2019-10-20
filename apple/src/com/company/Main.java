package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 3;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            // System.out.println(a*j);
            sum = sum + a * j;
            j = j - 1;


        }
        int sumb = 0;
        int k = 3;
        for (int i = 0; i < 3; i++) {
            int b = sc.nextInt();
            //System.out.println(b * j);
            sumb = sumb + b * k;
            k = k - 1;


        }
        if (sum > sumb) {
            System.out.println("A");


        } else if (sum < sumb)
            System.out.println("B");1
        else{
            System.out.println("C");
        }
    }
    }
