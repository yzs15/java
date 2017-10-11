package com.company;

import java.sql.Timestamp;
import java.util.*;
public class Book {
    String name = "undefined";
    int    ID    = 0;
    boolean valid = false;
    Borrow_return_time book_time = new Borrow_return_time();

    Book() { }
    void show_date()
    {
        if (valid)
            System.out.println("no one borrow");
        else
        {
            System.out.println(ID+" borrow_date:"+book_time.borrow_date.toString()+"\n");
            System.out.printf(ID+" borrowing_time:"+ book_time.borrowing_time/1000/24/3600+"days\n");
            System.out.println(ID+" need_to_return_date:"+book_time.need_to_return_date.toString()+"\n");
        }

    }
}

class Borrow_return_time
{
    Timestamp borrow_date = new Timestamp(0);
    long borrowing_time =30L*24L*3600L*1000L; //2 month for initial
    Timestamp need_to_return_date  = new Timestamp(0);

    void set_borrowing_time(long new_borrowing_time)
    {
        borrowing_time = new_borrowing_time;
    }

    void borrow_book()
    {
        borrow_date.setTime(new Date( ).getTime());
        need_to_return_date.setTime(borrow_date.getTime()+ borrowing_time);
    }

    void show_date()
    {
        System.out.println("borrow_date:"+borrow_date.toString()+"\n");
        System.out.printf("borrowing_time:"+ borrowing_time/1000/24/3600+"days\n");
        System.out.println("need_to_return_date:"+need_to_return_date.toString()+"\n");
    }

}