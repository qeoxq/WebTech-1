package classesAndObjects.task12_15;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 100, 1);
        Book book2 = new Book("50 shades of gray", "E. L. James", 120, 2);
        Book book3 = new Book("The Hundred and One Dalmatians", "Dodie Smith", 110, 3);
        ProgrammerBook prBook1 = new ProgrammerBook("Algorithms", "Robert Sedgewick", 90, 4, "Java", 2);
        ProgrammerBook prBook2 = new ProgrammerBook("JavaScript For Dummies", "Chris Minnik & Eva Holland", 80, 5, "JavaScript", 1);
        Book book4 = book1.clone();

        System.out.println("toString()");
        System.out.println(book2.toString());
        System.out.println(prBook1.toString());

        System.out.println("equals()");
        System.out.println("book1 and book2: " + book1.equals(book2));
        System.out.println("book1 and book4: " + book1.equals(book4));
        System.out.println("book3 and String: " + book3.equals("String"));

        System.out.println("hashCode(): " + prBook1.hashCode());

        Book[] arrayOfBook = {book2, book4, book3, book1, prBook2, prBook1};
        System.out.println("Default array:");
        System.out.println(Arrays.toString(arrayOfBook));

        Arrays.sort(arrayOfBook);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arrayOfBook));

        Arrays.sort(arrayOfBook, new BookTitleComparator());
        System.out.println("Sorted by title:");
        System.out.println(Arrays.toString(arrayOfBook));

        Arrays.sort(arrayOfBook, new BookTitleComparator().thenComparing(new BookAuthorComparator()));
        System.out.println("Sorted by title, then by author:");
        System.out.println(Arrays.toString(arrayOfBook));

        Arrays.sort(arrayOfBook, new BookAuthorComparator().thenComparing(new BookTitleComparator().thenComparing(new BookPriceComparator())));
        System.out.println("Sorted by author, then by title, then by price:");
        System.out.println(Arrays.toString(arrayOfBook));
    }
}
