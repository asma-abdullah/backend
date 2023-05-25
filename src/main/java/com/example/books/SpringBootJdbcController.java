package com.example.books;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;

    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("INSERT INTO `sys`.`book` (`BookID`, `BookTitle`, `AuthorID`, `Rating`, `BookPrice`)");
        return "Insertion successful";
    }    

    @RequestMapping(path = "/getBooks", method = RequestMethod.GET)
    public List<Book> getBooks() throws IOException{
        List<Book> books = jdbc.query("SELECT * FROM `sys`.`book`", new ItemMapper());
        return books;
    }


}



// http://localhost:8080/