package com.company;

public class Book_test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "first";
        book1.ID = 1;
        book1.valid = true;
        book1.book_time.borrow_book();
        book1.book_time.show_date();
        System.out.println(book1.name+book1.ID+book1.valid);
    }
}
