package com.LibraryClasses;

import java.util.*;

public class Assignment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String finalword = " ";
        char ch;
        int len;

        System.out.println("Enter a word");
        String word = sc.nextLine();

        len = word.length();
        word = word.toLowerCase();

        for(int i = 0; i<len; i++)
        {
            ch = word.charAt(i);

            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                finalword = finalword + ((char)(int)(ch+1));
            }
            else
                finalword = finalword+ch;
        }
        System.out.println("Final output: "+finalword);
    }
}