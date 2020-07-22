package com.LibraryClasses;

public class LongAndShortWords
{
    public static void main (String[] args)
    {
        String s = "This is a JAVA Program to find the Long and short Words";
        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="",maxword="",minword="";
        char ch;
        int p,maxl=0,minl=len;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x=x+ch; //adding characters to form word if character is not space
            }
            else
            {
                p=x.length();
                if(p<minl) //checking for minimum length
                {
                    minl=p;
                    minword=x;
                }
                if(p>maxl) //checking for maximum length
                {
                    maxl=p;
                    maxword=x;
                }
                x=""; //emptying the temporary variable to store next word
            }
        }
        System.out.println("Shortest word = "+minword+"\nLength = "+minl);
        System.out.println("Longest word = "+maxword+"\nLength = "+maxl);
    }
}
