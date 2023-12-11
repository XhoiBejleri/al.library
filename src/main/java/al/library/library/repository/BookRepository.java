package al.library.library.repository;

import al.library.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Set;

@Repository
public class BookRepository {
    private Long id = 0L;
    private final HashMap<Long, Book> memory = new HashMap<>();
    public Book getById(Long id) {
        return memory.get(id);
    }

    public Book createBook(Book book) {
        book.setId(id);
        memory.put(id, book);
        this.id ++;
        return book;
    }
    public void delete(Long id) {
        this.memory.remove(id);
    }

    public Set<Book> getList() {
        return Set.copyOf(memory.values());
    }
}
