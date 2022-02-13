package com.company;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();
        System.out.println("Total price of house: " +methods.TotalPriceOfHouse());
        System.out.println("Total price of villa: "+methods.TotalPriceOfVilla());
        System.out.println("Total price of summer house: "+methods.TotalPriceOfSummerHouse());
        System.out.println("Total price of all types of houses: "+methods.TotalPriceOfAllTypesOfHouses());
        System.out.println("Total square meters of house: "+methods.TotalMeterSquareOfHouse());
        System.out.println("Total square meters of villa: "+methods.TotalMeterSquareOfVilla());
        System.out.println("Total square meters of summer house: "+methods.TotalMeterSquareOfSummerHouse());
        System.out.println("Total square meters of all types of houses: "+methods.TotalMeterSquareOfAllTypesOfHouses());
        System.out.println(methods.NumberOfRoomsAndSaloon());


    }
}
