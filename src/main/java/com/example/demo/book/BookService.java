package com.example.demo.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> findAll(){
        return repository.findAll();
    }

    public void save(BookRequest bookRequest){
        var book = Book.builder()
                .author(bookRequest.getAuthor())
                .isbn(bookRequest.getIsbn())
                .build();
        repository.save(book);
    }
    public void update(BookRequest bookRequest){
        var book = Book.builder()
                .id(bookRequest.getId())
                .author(bookRequest.getAuthor())
                .isbn(bookRequest.getIsbn())
                .build();
        repository.save(book);
    }

}
