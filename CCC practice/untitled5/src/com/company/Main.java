package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int shift = 0;
        int sum = 0;
        for(int i=0;i<n;n++) {
            shift = shift * 10;
            sum = sum + shift;
        }
        System.out.println(sum);
    }
}
