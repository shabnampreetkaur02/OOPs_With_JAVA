package com.library.books;

import com.library.exception.BookNotFoundException;

public class book {
    private int bookid;
    private String title;
    private String author;
    private int availablecopies;

    public book(int bookid, String title, String author, int availablecopies){
        this.bookid= bookid;
        this.title=title;
        this.author=author;
        this.availablecopies=availablecopies;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getBookid(){
        return bookid;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setAvailablecopies(int availablecopies) {
        this.availablecopies = availablecopies;
    }

    public int getAvailablecopies() {
        return availablecopies;
    }

    public void displayBook() throws BookNotFoundException {
        System.out.println(bookid);
        System.out.println(title);
        System.out.println(author);

    }


}
