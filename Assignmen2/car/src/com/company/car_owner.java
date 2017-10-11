package com.company;

public class car_owner {
    String name = "unnamed";
    int ID = 0;
    int number_of_car = 0;
    int [] car_ID = new int[20];

    void show_info()
    {
       int i;
        if (number_of_car == 0)
            System.out.println("it has no car");
        else
            for (i = 0; i< number_of_car; i++)
            {
                System.out.println(name+" buy the "+i+"th car:"+car_ID[i]);
            }
    }


}
