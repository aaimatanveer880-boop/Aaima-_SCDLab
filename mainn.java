public class mainn {
    public static void main(String[] args) {
        Students student1 = new Students("Eman", 101);
        Students student2 = new Students("Ali", 103);

        System.out.println("=== Student Details ===");
        student1.displayInfo();
        student2.displayInfo();
    }
}

