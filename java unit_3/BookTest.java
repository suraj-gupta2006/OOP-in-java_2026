class Book {
    String title, author;
    double price;

    Book() { // default
        title = "Unknown";
        author = "Anonymous";
        price = 0.0;
    }

    Book(String t, String a, double p) { // parameterized
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " by " + author + ", Rs." + price);
    }
}

public class BookTest {
    public static void main(String[] args) {
        System.out.println("suraj gupta");
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "Balagurusamy", 550);
        b1.display();
        b2.display();
    }
}