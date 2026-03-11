package com.library.main;

import com.library.books.book;
import com.library.service.LibraryService;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();
        int choice;
        do {

            System.out.println("Add book");
            System.out.println("View book");
            System.out.println("Issue book");
            System.out.println("Return book");
            System.out.println("Exit");

            System.out.println("Enter choice");
            choice = sc.nextInt();
            if (choice == 1) {
                try {

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Copies: ");
                    int copies = sc.nextInt();

                    book b = new book(id, title, author, copies);
                    service.addBook(b);

                } catch (Exception e) {
                    System.out.println("Error while adding book: " + e.getMessage());
                }
            }

            else if (choice == 2) {
                try {
                    service.viewBook();
                } catch (Exception e) {
                    System.out.println("Error while viewing books: " + e.getMessage());
                }
            }
            else if (choice == 3) {
                try {

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    service.issueBook(id);

                } catch (Exception e) {
                    System.out.println("Error while issuing book: " + e.getMessage());
                }
            }


            else if (choice == 4) {
                try {

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    service.returnBook(id);

                } catch (Exception e) {
                    System.out.println("Error while returning book: " + e.getMessage());
                }
            }

        } while (choice != 5);

        sc.close();
    }
}