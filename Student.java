class Student extends Person {

    String subject;
    int rollNo; // new attribute

    Student(String name, String subject, int rollNo) {
        super(name);
        this.subject = subject;
        this.rollNo = rollNo;
    }

    // Method Overriding
    @Override
    void displayRole() {
        System.out.println(name + " is a Student, Roll No: " + rollNo + " and studies " + subject);
    }
}
