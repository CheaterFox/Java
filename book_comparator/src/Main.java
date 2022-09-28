import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Suç ve Ceza",384,"Dostoyevski",1866));
        books.add(new Book("Ana",344,"Gorki",1906));
        books.add(new Book("Sefiller",479,"Victor Hugo",1862));
        books.add(new Book("Ateşten Gömlek",221,"Halide Edip Adıvar",1922));
        books.add(new Book("Diriliş",284,"Tolstoy",1899));

        System.out.println("##################");
        System.out.println("#| Sort by name |#");
        System.out.println("##################");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        int i = 1;
        for (Book book: books){
            System.out.print(i + ".");
            System.out.printf("%s %-20s ", " Book's Name : " , book.getName());
            System.out.printf("%s %-22s ","Author's Name : " , book.getAuthor());
            System.out.printf("%s %-10s ", "Page Number : ", book.getTotalPages());
            System.out.printf("%s %s %n", "Release Date : ", book.getReleaseDate());
            i++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        TreeSet<Book> newBooks = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTotalPages() - o2.getTotalPages();
            }
        });
        newBooks.add(new Book("Suç ve Ceza",384,"Dostoyevski",1866));
        newBooks.add(new Book("Ana",344,"Gorki",1906));
        newBooks.add(new Book("Sefiller",479,"Victor Hugo",1862));
        newBooks.add(new Book("Ateşten Gömlek",221,"Halide Edip Adıvar",1922));
        newBooks.add(new Book("Diriliş",284,"Tolstoy",1899));


        System.out.println("#########################");
        System.out.println("#| Sort by page number |#");
        System.out.println("#########################");
        i = 1;
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        for (Book book: newBooks){
            System.out.print(i + ".");
            System.out.printf("%s %-10s ", "Page Number : ", book.getTotalPages());
            System.out.printf("%s %-20s ", " Book's Name : " , book.getName());
            System.out.printf("%s %-22s ","Author's Name : " , book.getAuthor());
            System.out.printf("%s %s %n", "Release Date : ", book.getReleaseDate());
            i++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }
}
