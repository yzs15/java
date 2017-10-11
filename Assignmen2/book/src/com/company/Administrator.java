package com.company;

import java.sql.Timestamp;
import java.util.*;

public class Administrator {
    int max_book_can_borrow = 10;

    boolean borrow_a_book(Student student,Book book)
    {
        if (book.valid == false)
        {
            System.out.println("the book is not valid");
            return false;
        }
        else if (student.number_of_book_borrow >= max_book_can_borrow)
        {
            System.out.println("the student can't borrow more");
            return false;
        }
        for (int i = 0; i< max_book_can_borrow; i++)
            if (student.book_ID[student.number_of_book_borrow] == 0)
            {
                student.book_ID[i] = book.ID;
                break;
            }
        student.number_of_book_borrow++;
        book.valid = false;
        book.book_time.borrow_book();
        return true;
    }

    boolean return_a_book(Student student,Book book)
    {
        if (book.valid == true)
        {
            System.out.println("the book does not borrowed");
            return false;
        }
        else if (student.number_of_book_borrow == 0)
        {
            System.out.println("the student does not borrow any book");
            return false;
        }
        for (int i = 0; i< max_book_can_borrow; i++)
            if (student.book_ID[student.number_of_book_borrow] == book.ID)
            {
                student.book_ID[i] = 0;
                break;
            }
        student.number_of_book_borrow--;
        book.valid = true;
        return true;
    }

}