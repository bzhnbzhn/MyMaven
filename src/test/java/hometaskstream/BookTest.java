package hometaskstream;

import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertEquals(35, Book.getTotalPriceOfAllBooks(bookList));
    }

    @Test
    void getNumberOfBooksWithFiveLettersName() {
        assertEquals(1, Book.getNumberOfBooksWithFiveLettersName(bookList));
    }

    @Test
    void getBookNameOnALetter() {
        assertEquals("abcde", Book.getBookNameOnALetter(bookList));
    }

    @Test
    void getBookWithHighestPrice() {
        assertEquals("java", Book.getBookWithHighestPrice(bookList));
    }

    @Test
    void getBookListThatPriceHigher30() {
        System.out.println(Book.getBookListThatPriceHigher30(Book.getRandomBooks(10)));
    }

    @Test
    void getBookListInDescOrder() {
        System.out.println(Book.getBookListInDescOrder(Book.getRandomBooks(10)));
    }

    @Test
    void getLibraryName() {
        Book book1 = new Book("Book", 5);
        Book book2 = new Book("Book", 5);
        assertEquals("print this string", Book.getLibraryName(book1, book2));
    }
}