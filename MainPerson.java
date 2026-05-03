public class MainPerson {
    public static void main(String[] args) {

        // Teacher object
        Teacher t = new Teacher("Aaima", "Biology");
        t.teach();   

        // Student object
        Student s = new Student("Eman", "Computer Science", 101);
        s.displayRole();

        // HOD object
        HOD h = new HOD("Dr. Khan", "Computer Science", "IT");
        h.displayHOD();

        // Parent object
        Person p = new Person("Ahmad");
        p.displayRole();
    }
}
