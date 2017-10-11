package com.company;

public class Student {
    String name = "unnamed";
    String ID   = "undefined";
    int number_of_book_borrow = 0;
    int[] book_ID = new int[20]; //假设最多借20本

    void show_information()
    {
        int i;
        if (number_of_book_borrow > 20)
            System.out.println("error, number_of_book_borrow must less than 21");



    }
}

