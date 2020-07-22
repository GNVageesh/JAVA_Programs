package com.Iterations;

public class LongestWord
{
    public static void main (String[] args)
    {
        String s = "Welcome to the World of JAVA";
        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="",maxw="";
        char ch;
        int p,maxl=0;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x=x+ch; //adding characters to form word if character is not space
            }
            else
            {System.out.println("x = "+x);
                p=x.length();
                if(p>maxl) //checking for maximum length
                {
                    maxl=p;
                    maxw=x;
                }
                x=""; //emptying the temporary variable to store next word
            }
        }
        System.out.println("Longest word = "+maxw+"\nLength = "+maxl);
    }
}
