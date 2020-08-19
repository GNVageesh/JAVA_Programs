package com.Iterations;

import java.util.Scanner;
public class dowhile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 no");
        int n1 = sc.nextInt();

        System.out.print("Enter 2 no");
        int n2 = sc.nextInt();

        System.out.println("GCD is: "+Gd(n1, n2));
    }

    static int Gd(int num1, int num2)
    {
        do
        {
            if(num1>num2)
            {
                num1-=num2;
            }
            else
            {
                num2-=num1;
            }
        }
        while (num1 != num2);
        return num1;
    }
}
