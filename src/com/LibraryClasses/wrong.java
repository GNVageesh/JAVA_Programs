package com.LibraryClasses;

public class wrong
{
    public static void main (String s, String s1)//s1 is the word to be searched//
    {
        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="", wrd="";
        char ch;
        int p, wod;
        int count = 0;
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
                {
                    wod=p;
                    wrd=x;
                    if(wrd.equals(s1))
                        count++;
                }
                x=""; //emptying the temporary variable to store next word
                System.out.println(wrd);

            }
        }
        System.out.println("The word "+s1+" occurs "+count+ " times");
    }
}

