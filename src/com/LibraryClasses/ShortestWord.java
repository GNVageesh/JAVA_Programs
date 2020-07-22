package com.LibraryClasses;

public class ShortestWord //prints only the shortest word//
{
    public static void main (String[] args)
    {
        String s = "Java is the World";
        s=s+" ";
        int len=s.length(); //finding the length of the sentence
        String x="",minw="";
        char ch;
        int p,minl=len;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x+=ch; //adding characters to form word if character is not space
            }
            else
            {
                p=x.length();
                if(p<minl) //checking for minimum length
                {
                    minl=p;
                    minw=x;
                }
                x=""; //emptying the temporary variable to store next word
            }
        }
        System.out.println("Shortest word = "+minw+"\nLength = "+minl);

    }
}