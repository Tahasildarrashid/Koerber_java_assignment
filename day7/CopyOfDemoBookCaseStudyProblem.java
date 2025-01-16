package day7;

import java.util.*;
import java.util.stream.Collectors;

public class CopyOfDemoBookCaseStudyProblem {

    public static void main(String[] args) {

        List<Book> allBooks = loadAllBooks();
        allBooks.forEach(System.out::println);

        // 1. Find books with more then 400 pages
        List<Book>booksMoreThen400Pages = allBooks.stream()
                .filter(b-> b.getPages()>=400)
                .toList();
        booksMoreThen400Pages.forEach(System.out::println);

        // 2. Find all books that are java books and more then 400 pages
        List<Book> booksThatareJavaAndHas400Pages = allBooks.stream()
                .filter(b -> b.getPages() >= 400)
                .filter(b -> b.getTitle().equalsIgnoreCase("java"))
                .toList();

        booksThatareJavaAndHas400Pages.forEach(System.out::println);

        // 3. We need the top three longest books
        List<Book> longestBooks = allBooks.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .limit(3)
                .toList();
        longestBooks.reversed().forEach(System.out::println);

        // 4. We need from the fourth to the last longest books
                List<Book> longestBooks = allBooks.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .skip(3)
                .toList();
        longestBooks.reversed().forEach(System.out::println);

        // 5. We need to get all the publishing years
        List<Integer> allTheYears = allBooks.stream()
                .map(b->b.getYear())
                .distinct()
                .collect(Collectors.toList());

        allTheYears.forEach(System.out::println);

        // 6. We need all the authors names who have written a book
            allBooks.stream()
                .flatMap(b-> b.getAuthors().stream()).map(a->a.getName()).distinct().count();

        // We need all the origin countries of the authors
            List<String> arr = allBooks.stream()
                    .flatMap(b->b.getAuthors().stream()).map(a->a.getCountry()).distinct().collect(Collectors.toList());

            arr.forEach(System.out::println);

        // We want the most recent published book.
        Optional<Book> RecentPublishedBook = allBooks.stream()
                .max(Comparator.comparing(Book::getYear));

        // We want to know if all the books are written by more than one author
        List<Author> arr = allBooks.stream()
                .flatMap(b->b.getAuthors().stream()).distinct().collect(Collectors.toList());

        arr.forEach(System.out::println);

        // We want one of the books written by more than one author. (findAny)
        boolean arr = allBooks.stream()
                .allMatch(b->b.getAuthors().size() > 1);

        System.out.println(arr);

        // We want the total number of pages published.
        int arr = allBooks.stream()
                .map(b->b.getPages())
                .reduce(0, (a, b) -> a+b)  ;

        System.out.println(arr);


        // We want to know how many pages the longest book has.
        Optional<Integer> longestBook = Book.stream().map(b -> b.getPages())
                .reduce(Integer::max);
        System.out.println(longestBook);

        // We want the average number of pages of the books
        Double avgPages = allBooks.stream().collect(
                Collectors.averagingDouble(Book::getPages));
        System.out.println(avgPages);

        // We want all the titles of the books
        String arr = allBooks.stream()
                .map(b->b.getTitle())
                .collect(Collectors.joining(", "));

        System.out.println(arr);

        // We want the book with the higher number of authors?
        Optional<Book> arr = allBooks.stream()
                .collect(Collectors.maxBy(Comparator.comparing((Book b)->b.getAuthors().size())));


        // We want a map of book per year

        Map<Integer, List<Book>> yearBooks = allBooks.stream().collect(
                Collectors.groupingBy(Book::getYear));

        // We want to count how many books are published per year.

        Map<Integer, Long> yearBooks1 = allBooks.stream().collect(
                Collectors.groupingBy(Book::getYear, Collectors.counting()));
    }

    private static List<Book> loadAllBooks()
    {
        List<Book> books = new ArrayList<Book>();
        List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
                new Author("ekta", "gupta", "in"));

        List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

        List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
                new Author("keshav", "gupta", "us"));

        List<Author> authors4 = Arrays.asList(new Author("rashid", "tahasildar", "us"),
                new Author("rajeev", "kalose", "us"));

        books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
        books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
        books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2005, "1293"));
        books.add(new Book("C++", authors4, 6000, Subject.DOT_NET, 2008, "1290"));

        return books;
    }

}