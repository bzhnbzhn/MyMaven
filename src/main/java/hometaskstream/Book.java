package hometaskStream;

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
        return "Book name is " + this.name.toUpperCase() + " Book price is " + this.price + "$";
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
        String generatedString = buffer.toString();
        return generatedString;
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

    public static void main(String[] args) {

        List<Book> booksList = new ArrayList<>(Book.getRandomBooks(10));
        booksList.add(new Book("ABC", 99));
        booksList.add(new Book("abc", 100));
        booksList.add(new Book("I love Java", 100));
        booksList.add(new Book("I love Java", 101));

        Integer sumOfBooksPrices = booksList
                .stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);
        System.out.println("The sum of books prices is " +sumOfBooksPrices + "$");

        Set<String> booksNameOnALetter = booksList
                .stream()
                .map(Book::getName)
                .filter(booksName -> booksName.startsWith("A") || booksName.startsWith("a"))
                .collect(Collectors.toSet());
        System.out.println("Books that starts on A letter are: " + booksNameOnALetter);

        Book bookWithHighestPrice = booksList
                .stream()
                .max(Comparator.comparing(Book::getPrice))
                .get();
        System.out.println("The highest price book is: " + bookWithHighestPrice);

        Long booksWithFiveLettersName = booksList
                .stream()
                .map(Book::getName)
                .filter(bookName -> bookName.length() >= 5).count();
        System.out.println(booksWithFiveLettersName + " Books have name longer that 5 letter");

        List<Book> booksPriceHigher30 = booksList
                .stream()
                .filter((book) -> book.getPrice() >= 30)
                .collect(Collectors.toList());
        System.out.println("A list of books with price higher than 30$: " + booksPriceHigher30);

        List<Book> bookInDescOrder = booksList
                .stream()
                .sorted(Comparator.comparing(Book::getName).reversed().thenComparingDouble(Book::getPrice))
                .collect(Collectors.toList());
        System.out.println("All books in desc order "+ bookInDescOrder);

        Book book1 = new Book("Book", 5);
        Book book2 = new Book("Book", 5);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "print this string");
        String get = mapWithBook.get(book2);
        System.out.println(get);
    }
}