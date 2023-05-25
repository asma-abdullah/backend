package com.example.books;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper implements RowMapper {
    
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
        Book b = new Book();
        b.setBookID(rs.getString("book_id"));
        b.setBookPrice(rs.getString("book_price"));
        b.setBookTitle(rs.getString("book_title"));
        b.setAuthorID(rs.getString("author_id"));
        b.setRating(rs.getString("rating"));
        return b;
    }
}