package Lab1;

public class Book {
    private String genre;
    private int pages;
    public Book(String bookgenre, int bookpages) {
        genre = bookgenre;
        pages = bookpages;
    }

    public Book(String bookgenre) {
        genre = bookgenre;
        pages = 0;
    }

    public Book(int bookpages) {
        pages = bookpages;
        genre = "С рисунком или прозрачный";
    }

    public int GP()
    {
        return pages;
    }
    public String GG()
    {
        return genre;
    }

    public void SP(int bookpages) {
        this.pages = bookpages;
    }
    public void SG(String bookgenre) {
        this.genre = bookgenre;
    }

    public String toString(){return "Genre of a book: " + this.genre + ", pages in the book:" + this.pages;}
    public static void main(String[] args) {
        Book book1 = new Book("Мистика", 100);
        Book book2 = new Book("Детектив");
        Book book3 = new Book(28);
        book3.SG("Приключение");
        System.out.println(book3);
    }
}
