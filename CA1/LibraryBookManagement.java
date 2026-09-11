import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;

    Book(int bookId, String title, String author, String category, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + bookId +
               ", Title: " + title +
               ", Author: " + author +
               ", Category: " + category +
               ", Price: ₹" + price;
    }
}

public class LibraryBookManagement {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Programming", "Author XYZ",
                "Java", 650));

        books.add(new Book(102, "Effective Java", "Joshua Author ABC",
                "Java", 550));

        books.add(new Book(103, "Python Basics", "Author xy",
                "Programming", 450));

       
        books.stream()
                .filter(book -> book.category.equalsIgnoreCase("Java"))
                .forEach(System.out::println);


        books.stream()
                .filter(book -> book.price > 500)
                .forEach(System.out::println);


        books.stream()
                .map(book -> book.title)
                .forEach(System.out::println);


        books.stream()
                .sorted((b1, b2) -> Double.compare(b2.price, b1.price))
                .forEach(System.out::println);

        Optional<Book> highestPricedBook = books.stream()
                .max(Comparator.comparingDouble(book -> book.price));

        highestPricedBook.ifPresent(System.out::println);


        double totalPrice = books.stream()
                .map(book -> book.price)
                .reduce(0.0, (sum, price) -> sum + price);

        System.out.println("Total Price = ₹" + totalPrice);

        Map<String, List<Book>> groupedBooks = books.stream()
                .collect(Collectors.groupingBy(book -> book.category));

        groupedBooks.forEach((category, bookList) -> {
            System.out.println("\nCategory: " + category);

            bookList.forEach(System.out::println);
        });

        List<String> cheapBookTitles = books.stream()
                .filter(book -> book.price < 500)
                .map(book -> book.title)
                .collect(Collectors.toList());

        cheapBookTitles.forEach(System.out::println);
    }
}