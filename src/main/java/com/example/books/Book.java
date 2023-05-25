package com.example.books;

public class Book {
    String BookID;
    String BookTitle;
    String BookPrice;
    String AuthorID;
    String Rating;

    public String getBookID(){
        return BookID;
    }

    public void setBookID(String BookID){
        this.BookID = BookID;
    }

    public String getBookTitle(){
        return BookTitle;
    }

    public void setBookTitle(String BookTitle){
       this.BookTitle = BookTitle;
    }

    public String getBookprice(){
        return BookPrice;
    }

    public void setBookPrice(String BookPrice){
       this.BookPrice = BookPrice;
    }

    public String getAuthorID(){
        return AuthorID;
    }

    public void setAuthorID(String AuthorID){
        this.AuthorID = AuthorID;
    }

    public String getRating(){
        return Rating;
    }

    public void setRating(String Rating){
        this.Rating = Rating;
    }
}