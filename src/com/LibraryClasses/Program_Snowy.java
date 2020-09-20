package com.LibraryClasses;

import java.util.Scanner;

public class Program_Snowy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String reverse = "";
        int numberOfVowels = 0, length;

        System.out.println("Enter a String");
        String original = sc.nextLine();

        length = original.length();

        for(int i = length-1; i >= 0; i--)
        {
            char character = original.charAt(i);
            reverse = reverse + character;

            if(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            {
                numberOfVowels = numberOfVowels + 1;
            }
        }

        System.out.println("The Entered String was: "+original);
        System.out.println("The Reversed String is: "+reverse);
        System.out.println("The Length of the String is: "+length);
        System.out.println("The number of vowels in the String is: "+numberOfVowels);
    }
}
