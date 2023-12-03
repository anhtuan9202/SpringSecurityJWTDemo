package com.example.demo.book;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookRequest {
    private int id;
    private String author;
    private String isbn;

}
