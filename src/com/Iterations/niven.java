package com.Iterations;

import java.util.Scanner;
public class niven
{
    public static boolean niven(int num)
    {
        int sum = 0;

        for(int temp = num; temp != 0; temp/=10)
        {
            int digit = temp % 10;
            sum += digit;
        }
        return(num % sum == 0);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(niven(n))
            System.out.println(n+ " is a niven number");
        else
            System.out.println(n+ " is not an niven number");
    }
}
