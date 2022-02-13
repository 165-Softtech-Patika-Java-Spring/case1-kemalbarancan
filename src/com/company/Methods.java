package com.company;

import java.util.Scanner;

public class Methods {
    ListService listService = new ListService();
    Scanner scanner = new Scanner(System.in);

    public int TotalPriceOfHouse(){
        int TotalPriceOfHouse = 0;
        for(House house : listService.getHouseList()){
            TotalPriceOfHouse += house.getPrice();
        }
        return TotalPriceOfHouse;
    }

    public int TotalPriceOfVilla(){
        int TotalPriceOfVilla = 0;
        for(Villa villa : listService.getVillaList()){
            TotalPriceOfVilla += villa.getPrice();
        }
        return TotalPriceOfVilla;
    }

    public int TotalPriceOfSummerHouse(){
        int TotalPriceOfSummerHouse = 0;
        for(SummerHouse summerHouse : listService.getSummerHouseList()){
            TotalPriceOfSummerHouse += summerHouse.getPrice();
        }
        return TotalPriceOfSummerHouse;
    }

    public int TotalPriceOfAllTypesOfHouses(){
        int TotalPriceOfAllTypesOfHouses = TotalPriceOfHouse() + TotalPriceOfVilla() + TotalPriceOfSummerHouse();
        return TotalPriceOfAllTypesOfHouses;
    }

    public int TotalMeterSquareOfHouse(){
        int TotalMeterSquareOfHouse = 0;
        for(House house : listService.getHouseList()){
            TotalMeterSquareOfHouse +=house.getMeterSquare();
        }
        return TotalMeterSquareOfHouse;
    }

    public int TotalMeterSquareOfVilla(){
        int TotalMeterSquareOfVilla = 0;
        for(Villa villa : listService.getVillaList()){
            TotalMeterSquareOfVilla +=villa.getMeterSquare();
        }
        return TotalMeterSquareOfVilla;
    }

    public int TotalMeterSquareOfSummerHouse(){
        int TotalMeterSquareOfSummerHouse = 0;
        for(SummerHouse summerHouse : listService.getSummerHouseList()){
            TotalMeterSquareOfSummerHouse +=summerHouse.getMeterSquare();
        }
        return TotalMeterSquareOfSummerHouse;
    }
    public int TotalMeterSquareOfAllTypesOfHouses(){
        int TotalMeterSquareOfAllTypesOfHouses = TotalMeterSquareOfHouse() + TotalMeterSquareOfVilla() + TotalMeterSquareOfSummerHouse();
        return TotalMeterSquareOfAllTypesOfHouses;
    }

    public int NumberOfRoomsAndSaloon(){
        int NumberOfRooms, NumberOfSaloons;
        System.out.print("Enter the number of rooms: ");
        NumberOfRooms = scanner.nextInt();
        System.out.print("Enter the number of saloons: ");
        NumberOfSaloons = scanner.nextInt();
        if(NumberOfRooms <= 4 && NumberOfSaloons < 2){
            System.out.println("This is a house.");
        }
        else if(NumberOfRooms > 4 && NumberOfRooms < 7 && NumberOfSaloons >= 2 && NumberOfSaloons <= 3){
            System.out.println("This is a villa.");
        }
        else{
            System.out.println("This is a summer house.");
        }
        return NumberOfRoomsAndSaloon();
    }
}
