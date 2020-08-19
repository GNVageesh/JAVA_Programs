package com.LibraryClasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class removeVowels
{
    public static String remVowel(String str)
    {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> characterList = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i<sb.length(); i++)
        {
            if(characterList.contains(sb.charAt(i)))
            {
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return  sb.toString();
    }
    public static void main(String[] args)
    {
        String str = "This website is for losers LOL!";
        System.out.println(remVowel(str));
    }
}
