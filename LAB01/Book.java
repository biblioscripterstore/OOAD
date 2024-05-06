public class Book {
    private int bookId;
    private int pages;
    private double price;

    public Book() {
        this.bookId = 0;
        this.pages = 0;
        this.price = 0.0;
    }
    public Book(int bookId) {
        this.bookId = bookId;
        this.pages = 0;
        this.price = 0.0;
    }
    public Book(int bookId, int pages) {
        this.bookId = bookId;
        this.pages = pages;
        this.price = 0.0;
    }
    public Book(int bookId, int pages, double price) {
        this.bookId = bookId;
        this.pages = pages;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLarger(Book b) {
        return this.pages > b.getPages();
    }

    public boolean isExpensive(Book b) {
        return this.price > b.getPrice();
    }

    public void copy(Book b) {
        this.bookId = b.getBookId();
        this.pages = b.getPages();
        this.price = b.getPrice();
    }

    @Override
    public String toString() {
        return "\"" + bookId + ", " + pages + ", " + price + "\"";
    }

    public void display() {
        System.out.println("---------- Book Detail ----------");
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Pages: " + this.pages);
        System.out.println("Book Price: " + this.price);
    }
}
