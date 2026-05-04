public class LibraryMain {
    public static void main(String[] args) {

        // Creating array of Media type
        Media[] library = new Media[3];

        // Filling array
        library[0] = new Book1("Peer-e-kamil", 2020, "Umera Ahmed");
        library[1] = new Magazine("Aab-e-Hayat", 2024, 15);
        library[2] = new Book1("OOP Concepts", 2022, "Sara Ahmed");

        // Loop to display details
        for (int i = 0; i < library.length; i++) {
            library[i].displayDetails();
        }
    }
}
