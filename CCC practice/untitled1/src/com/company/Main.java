package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        float[] myarray = new float[a];
        for (int i = 0; i<a; i++ )
        {
            myarray[i] = sc.nextFloat();
        }
        Arrays.sort(myarray);
        float ans = (myarray[1] - myarray[0])/2 + (myarray[2] - myarray[1])/2;
        int realans;
        for (int i =2; i<a-1; i++)
        {
            float c = ((myarray[i] - myarray[i-1])/2) + ((myarray[i+1] - myarray[i]))/2;
            if (c<ans)
            {
                ans = c;
            }
        }
        realans = (int)ans;
        System.out.println(realans + ".0");
    }

}
