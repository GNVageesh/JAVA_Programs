package com.arraylists;

import java.util.ArrayList;

public class basic
{
    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("dog");

        ArrayList<String> plants = new ArrayList<>();

        plants.add(0,"coriander");
        plants.add(1,"tulsi");
        plants.add(2,"rudrakshi");
        plants.add(3,"touch-me-not");
        int size = plants.size();
        plants.remove(1);

        ArrayList<String> living = new ArrayList<>();

        living.addAll(animals);
        living.addAll(plants);

        System.out.println("Plant arraylist is: "+plants);
        System.out.println("Animals arraylist is: "+animals);
        System.out.println("Living arraylist is: "+living);
        System.out.println("The size of plants arraylist is: "+size);
    }
}
