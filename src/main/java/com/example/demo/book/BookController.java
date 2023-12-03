package com.example.demo.book;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService service;
    @GetMapping
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody BookRequest request){
        service.save(request);
        return ResponseEntity.accepted().build();
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody BookRequest request){
        service.update(request);
        return ResponseEntity.accepted().build();
    }



}
