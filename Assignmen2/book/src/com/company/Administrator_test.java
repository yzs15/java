package com.company;

public class Administrator_test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "first";
        book1.ID = 1;
        book1.valid = true;

        Book book2 = new Book();
        book2.name = "second";
        book2.ID = 2;
        book2.valid = false;

        Student Student1 = new Student();
        Student1.name = "xxx";
        Administrator Administrator1 = new Administrator();

        book1.show_date();
        Administrator1.borrow_a_book(Student1,book1);
        Student1.show_information();
        book1.show_date();

        Administrator1.return_a_book(Student1,book1);
        Student1.show_information();
        book1.show_date();

        Administrator1.borrow_a_book(Student1,book2);
        Student1.show_information();
        book2.show_date();

    }
}
