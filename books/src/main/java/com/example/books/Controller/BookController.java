package com.example.books.Controller;

import com.example.books.Entity.Book;
import com.example.books.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/books")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> returnAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping(path = "{id}")
    public Book getPupilByID(@PathVariable("id") int id){
        return bookService.getBooksByID(id);
    }

}
