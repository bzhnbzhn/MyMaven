package hometaskstream;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    List<Book> bookList = List.of(new Book("abcde", 10), new Book("test", 12), new Book("java", 13));

    @Test
    void printAllBooks() {
        System.out.println(Book.printAllBooks(Book.getRandomBooks(10)));
    }

    @Test
    void printAllBooksName() {
        System.out.println(Book.printAllBooksName(Book.getRandomBooks(10)));
    }

    @Test
    void getPriceOfAllBooks() {
        assertEquals(35, Book.getTotalPriceOfAllBooks(bookList), "Wrong total price was calculated");
    }

    @Test
    void getNumberOfBooksWithFiveLettersName() {
        assertEquals(1, Book.getNumberOfBooksWithFiveLettersName(bookList), "Wrong book with five letters was found");
    }

    @Test
    void getBookNameOnALetter() {
        assertEquals("abcde", Book.getBookNameOnALetter(bookList), "Wrong book on A letter was found");
    }

    @Test
    void getBookWithHighestPrice() {
        assertEquals("java", Book.getBookWithHighestPrice(bookList), "Wrong book with highest price was found");
    }

    @Test
    void getBookListThatPriceHigher30() {
        System.out.println(Book.excludeBookListThatPriceHigher30(Book.getRandomBooks(10)));
    }

    @Test
    void getBookListInDescOrder() {
        System.out.println(Book.getBookListInDescOrder(Book.getRandomBooks(10)));
    }

    @Test
    void getLibraryName() {
        Map<Book, String> mapWithBook = new HashMap<>();
        Book book1 = new Book("Book", 5);
        Book book2 = new Book("Book", 5);
        mapWithBook.put(book1, "print this string");
        assertEquals("print this string", Book.getLibraryName(book1, book2), "Wrong library name was found");
    }
}