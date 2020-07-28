package com.practise;

import java.util.Scanner;
public class primeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int c = 0;
        for(int i = 1; i<=num; i++)
        {
            if (num%i == 0)
            {
                c++;
            }
        }
        if(c == 2)
        {
            System.out.println("The entered number is an prime number");
        }
        else
        {
            System.out.println("The entered number is not an prime number");
        }
    }
}
