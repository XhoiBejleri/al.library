package al.library.library.service;

import al.library.library.model.Book;
import al.library.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public al.library.library.model.Book getBookById(Long id) {
        return repository.getById(id);
    }

    public al.library.library.model.Book createBook(al.library.library.model.Book book) {
        return repository.createBook(book);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
    public Set<Book> getList() {
        return repository.getList();
    }
}
