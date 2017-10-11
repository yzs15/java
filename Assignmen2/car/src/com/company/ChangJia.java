package com.company;

public class ChangJia {
    String name = "unamed";
    int car_num = 0;
    String [] car_name = new String[20];
    int [] car_ID = new int[20];

    boolean check_car(int new_car_id)
    {
        int i;
        for (i = 0; i<car_num; i++)
        {
            if (new_car_id == car_ID[i])
                return true;
        }
        return false;
    }

    void show_info()
    {
        int i;
        if (car_num == 0)
            System.out.println("it has no car");
        else
            for (i = 0; i< car_num; i++)
            {
                System.out.println("car_name:"+car_name[i]+" car_id:"+car_ID[i]);
            }
    }
}
