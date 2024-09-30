package joao.ifpr.foz.ifprstore.repositories;

import joao.ifpr.foz.ifprstore.models.Author;
import joao.ifpr.foz.ifprstore.models.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class BookRepositoryTest {
    @Test
    public void deveMeRetornaLivros() {
        BookRepository repository = new BookRepository();
        List<Book> books = repository.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void deveCriarUmLivro(){

    }

    @Test
    public void deveMeRetornaUmLivro() {
        BookRepository repository = new BookRepository();
        Book book = repository.findById(10);
        System.out.println(book);
    }



}
