package com.company;

public class Administrator {
    int max_car_can_buy = 20;
    relation [] record = new relation[100];
    int record_p = 0;
    void  buy_a_car(car_owner new_car_owner, ChangJia new_Changjia, int car_id )
    {
        if (! new_Changjia.check_car(car_id))
            System.out.println("the ChangJia do not have the Car");
        else if (new_car_owner.number_of_car >= max_car_can_buy)
            System.out.println("the buyer can't buy more");
        else
        {
            new_car_owner.car_ID[new_car_owner.number_of_car] = car_id;
            new_car_owner.number_of_car++;

            record[record_p] = new relation();
            record[record_p].buyer_ID = new_car_owner.ID;
            record[record_p].Car_ID = car_id;
            record[record_p].from = new_Changjia.name;
            record_p++;
        }

    }
    void show_info()
    {
        if (record_p == 0)
            System.out.println("no record");
        else
           // System.out.println("hhhh"+record_p);
           for (int i = 0; i< record_p; i++)
            {
                System.out.println("buyer_ID:"+record[i].buyer_ID+" Car_ID:"+record[i].Car_ID+" form "+record[i].from);
            }
    }
}

class relation
{
    String from = new String("nowhere");
    int buyer_ID = 0;
    int Car_ID = 0;
    void setBuyerID(int mBuyer_id) {

    }

}