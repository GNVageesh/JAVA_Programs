package com.Iterations;

import java.util.Scanner;

public class reverse_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s  = sc.nextLine();

        int len = s.length();
        s = s+ " ";
        String rev = " ";
        int p = 0;
        String wrd = " ";

        for(int i = 0; i<=len; i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                wrd = s.substring(p, i);
                p = i+1;
                rev = wrd + " " +rev;
            }
        }
        System.out.println("The entered statement is: "+s);
        System.out.println("The reversed Statement is: "+rev);
    }
}
