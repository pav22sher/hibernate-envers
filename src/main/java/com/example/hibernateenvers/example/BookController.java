package com.example.hibernateenvers.example;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository repository;

    @PostMapping
    public void save(@RequestBody Book book) {
        repository.save(book);
    }

    @PutMapping("/{id}/{name}")
    public void update(@PathVariable Long id, @PathVariable String name) {
        Book book = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        book.setName(name);
        repository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/last-revision/{id}")
    public Book getLastRevision(@PathVariable Long id) {
        Revision<Integer, Book> reservation = repository.findLastChangeRevision(id).orElseThrow(EntityNotFoundException::new);
        return reservation.getEntity();
    }

    @GetMapping("/revisions/{id}")
    public List<Book> getRevisions(@PathVariable Long id) {
        Revisions<Integer, Book> revisions = repository.findRevisions(id);
        return revisions.stream().map(Revision::getEntity).toList();
    }

}
