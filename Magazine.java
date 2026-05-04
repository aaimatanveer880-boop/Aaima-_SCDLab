public class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Magazine ----");
        super.displayDetails();
        System.out.println("Issue No: " + issueNumber);
        System.out.println();
    }
}
