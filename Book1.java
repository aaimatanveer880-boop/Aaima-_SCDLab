public class Book1 extends Media {
    private String author;

    public Book1(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Book ----");
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println();
    }
}
