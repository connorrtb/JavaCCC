package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int occupied = 0;
    String[] list = new String[2];
	for(int j = 0; j<2; j++) {

            String c = sc.next().substring(0,N);
            list[j]=c;


        }
	for (int k = 0;k<N;k++)
	{
	  if(list[0].charAt(k) == 'C' && list[1].charAt(k)=='C') {
	      occupied = occupied+1;

      }

    }
	System.out.println(occupied);

    }
}



