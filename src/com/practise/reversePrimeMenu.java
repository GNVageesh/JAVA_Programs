package com.practise;

import java.util.Scanner;
public class reversePrimeMenu
{
    static Scanner sc = new Scanner(System.in);

    public static void prime()
    {
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        int c = 0;
        for(int i = 1; i<=n1; i++)
        {
            if(n1%i == 0)
            {
                c++;
            }
        }
        if(c == 2)
        {
            System.out.println("The entered number is a prime number.");
        }
        else
        {
            System.out.println("The entered number is not a prime number.");
        }
    }

    public static void reverse()
    {
        System.out.println("Enter a number");
        int n2 = sc.nextInt();
        int ori = n2;
        int d, rev = 0;

        while(n2>0)
        {
            d = n2%10;
            rev = (rev*10)+d;
            n2 = n2/10;
        }
        System.out.println("The entered number was "+ori+" and it's reversed form is: "+rev);
    }

    public static void main(String[] args)
    {
        System.out.println("-----------Menu------------");
        System.out.println();
        System.out.println("1. Reverse Number");
        System.out.println("2. Prime Number");
        System.out.println("0. Exit The Program");
        System.out.println();
        System.out.println("Enter your Choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 0 -> System.exit(0);
            case 1 -> reverse();
            case 2 -> prime();
            default -> {
                System.out.println("Wrong Choice");
                System.out.println("Rerun the program");
            }
        }
    }
}
