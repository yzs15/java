package com.company;

public class test {
    public static void main(String[] args) {
        // write your code here
        car_owner people = new car_owner();
        ChangJia changjia = new ChangJia();

        for (int i = 0; i<10; i++)
        {
            changjia.car_ID[i] = i+1;
            changjia.car_name[i] = i+"";
        }

        changjia.car_num = 10;
        Administrator Adim = new Administrator();
        Adim.buy_a_car(people,changjia,1);
        Adim.buy_a_car(people,changjia,2);
        Adim.buy_a_car(people,changjia,20);
        people.show_info();
        changjia.show_info();
        Adim.show_info();
    }
}
