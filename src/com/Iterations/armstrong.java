package com.Iterations;

import java.util.Scanner;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long numOri, cube = 0;
        int total = 0;

        System.out.println("Enter a number: ");
        long num = sc.nextInt();
        
        numOri = num;
        while(num != 0)
        {
            total++;
            num = num / 10;
        }
        num = numOri;
        while (num > 0)
        {
            int digit = (int)num %10;
            long digitCube = (int)Math.pow(digit, total);
            cube = cube + digitCube;
            num = num / 10;
        }
        if(numOri == cube)
            System.out.println(numOri+" is armstrong");
        else
            System.out.println(numOri+" is not srmstrong");
    }
}
