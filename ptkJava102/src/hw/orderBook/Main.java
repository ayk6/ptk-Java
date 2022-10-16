package hw.orderBook;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books= new TreeSet<>();

        books.add(new Book("Dünya Klasikleri",100,"Umut Sarıkaya","2022"));
        books.add(new Book("Industrial Society",90,"Ted Kczynski","1995"));
        books.add(new Book("Civil Disobedience",150,"Henry David T.","1849"));
        books.add(new Book("Martin EDEN      ",250,"Jack LONDON   ","1909"));

        // sort by name
        System.out.println("--- sort by name ---");
        for (Book bookName: books){
            bookName.printBookData();
        }

        // sort by page num
        System.out.println("\n--- sort by page ---");
        TreeSet<Book> books2=new TreeSet<>(Comparator.comparingInt(Book::getPageNum));

        books2.add(new Book("Dünya Klasikleri",100,"Umut Sarıkaya","2022"));
        books2.add(new Book("Industrial Society",90,"Ted Kczynski","1995"));
        books2.add(new Book("Civil Disobedience",150,"Henry David T.","1849"));
        books2.add(new Book("Martin EDEN     ",250,"Jack LONDON   ","1909"));

        for (Book bookPage: books2){
            bookPage.printBookData();
        }



    }
}
