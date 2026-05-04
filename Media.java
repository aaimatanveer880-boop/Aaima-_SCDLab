public class Media {
    protected String title;
    protected int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}
