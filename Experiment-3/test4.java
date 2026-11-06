class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class test4 {
    public static void main(String[] args) {
        Author author = new Author("Herbert Schildt", "herbert@example.com", 'M');
        Book book = new Book("Java: The Complete Reference", author, 650.0, 50);

        System.out.println("--- Book Details ---");
        System.out.println("Book Name    : " + book.getName());
        System.out.println("Author       : " + book.getAuthor());
        System.out.println("Price        : Rs. " + book.getPrice());
        System.out.println("Stock Qty    : " + book.getQtyInStock());
    }
}

