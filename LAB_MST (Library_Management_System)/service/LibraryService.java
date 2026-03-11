package com.library.service;
import com.library.books.book;

import com.library.exception.BookNotAvailableException;
import com.library.exception.BookNotFoundException;
import java.util.*;
import java.io.*;

public class LibraryService {
    File file= new File("books.txt");

    public void addBook(book b) throws Exception{

        FileWriter fw= new FileWriter(file, true);


    }

    public void viewBook() {
    }

    public void issueBook(int i) {
    }

    public void returnBook(int i) {
    }

}
