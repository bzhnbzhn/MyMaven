package hometaskstream;

import java.util.*;
import java.util.stream.Collectors;


public class Book {
    private String name;
    private int price;

    public Book() {
        this.price = getRandomBookPrice();
        this.name = getRandomBookName();
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Book name is " + this.name + " Book price is " + this.price + "$";
    }

    public static String getRandomBookName() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.substring(0, 1).toUpperCase() + buffer.substring(1);
    }

    public static int getRandomBookPrice() {
        return (int) (Math.random() * 100);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static List<Book> getRandomBooks(int size) {
        List<Book> book = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            book.add(new Book());
        }
        return book;
    }

    public static Collection<Book> printAllBooks(List<Book> bookList) {
        return bookList;
    }

    public static List<String> printAllBooksName(List<Book> bookList) {
        return bookList
                .stream()
                .map(Book::getName)
                .collect(Collectors.toList());
    }

    public static Integer getTotalPriceOfAllBooks(List<Book> bookList) {
        return bookList
                .stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);
    }

    public static Long getNumberOfBooksWithFiveLettersName(List<Book> booksList) {
        return booksList
                .stream()
                .map(Book::getName)
                .filter(bookName -> bookName.length() == 5).count();
    }

    public static String getBookNameOnALetter(List<Book> bookList) {
        return bookList
                .stream()
                .map(Book::getName)
                .filter(booksName -> booksName.startsWith("A") || booksName.startsWith("a"))
                .findFirst()
                .get();
    }

    public static String getBookWithHighestPrice(List<Book> bookList) {
        return bookList
                .stream()
                .max(Comparator.comparing(Book::getPrice))
                .map(Book::getName)
                .get();
    }

    public static Collection<Book> excludeBookListThatPriceHigher30(List<Book> bookList) {
        return bookList
                .stream()
                .filter(book -> book.getPrice() <= 30)
                .collect(Collectors.toList());
    }

    public static Collection<Book> getBookListInDescOrder(List<Book> bookList) {
        return bookList
                .stream()
                .sorted(Comparator.comparing(Book::getName).reversed().thenComparingDouble(Book::getPrice))
                .collect(Collectors.toList());
    }
}