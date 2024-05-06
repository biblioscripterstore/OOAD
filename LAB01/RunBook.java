public class RunBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Default constructor:");
        book1.display();

        Book book2 = new Book(101);
        System.out.println("\nConstructor with bookId:");
        book2.display();

        Book book3 = new Book(102, 200);
        System.out.println("\nConstructor with bookId and pages:");
        book3.display();

        Book book4 = new Book(103, 300, 19.99);
        System.out.println("\nConstructor with bookId, pages, and price:");
        book4.display();

        book1.setBookId(104);
        book1.setPages(150);
        book1.setPrice(15.99);
        System.out.println("\nAfter using setters:");
        book1.display();

        System.out.println("\nUsing getters:");
        System.out.println("Book ID: " + book1.getBookId());
        System.out.println("Book Pages: " + book1.getPages());
        System.out.println("Book Price: " + book1.getPrice());

        System.out.println("\nComparing pages:");
        System.out.println("book1 is larger than book2: " + book1.isLarger(book2));
        System.out.println("book2 is larger than book3: " + book2.isLarger(book3));

        System.out.println("\nComparing prices:");
        System.out.println("book4 is more expensive than book1: " + book4.isExpensive(book1));
        System.out.println("book1 is more expensive than book3: " + book1.isExpensive(book3));

        System.out.println("\nCopying book2 to book1:");
        book1.copy(book2);
        System.out.println("Book1 after copy:");
        book1.display();

        System.out.println("\nUsing toString method:");
        System.out.println("Book1 details: " + book1);
    }
}
