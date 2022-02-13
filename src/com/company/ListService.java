package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListService {

    House house = new House(150,150);
    House house2 = new House(120,120);
    House house3 = new House(100,100);

    SummerHouse summerHouse = new SummerHouse(180,180);
    SummerHouse summerHouse2 = new SummerHouse(150,150);
    SummerHouse summerHouse3 = new SummerHouse(120,120);

    Villa villa = new Villa(200,200);
    Villa villa2 = new Villa(180,180);
    Villa villa3 = new Villa(150,150);

    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        houseList.add(house);
        houseList.add(house2);
        houseList.add(house3);
        return houseList;
    }
    public List<SummerHouse> getSummerHouseList() {
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(summerHouse);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);
        return summerHouseList;
    }
    public List<Villa> getVillaList() {
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa);
        villaList.add(villa2);
        villaList.add(villa3);
        return villaList;
    }
}
