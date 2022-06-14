package com.company;

public class CountryTest {
    public static void main(String[] args) {
        Country myCountry=new Country();
        myCountry.name="Ukraine";
        myCountry.capital="Kiev";
        myCountry.square=637000;
        myCountry.population=41167336;

        System.out.println("\nMy Country info:");
        System.out.println("Title: " + myCountry.name);
        System.out.println("Capital: " + myCountry.capital);
        System.out.println("Square km2: " + myCountry.square);
        System.out.println("Population: " + myCountry.population);
    }


    }

