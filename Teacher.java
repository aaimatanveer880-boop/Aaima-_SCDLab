public class Teacher extends Person {

    String subject; 

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teach() { 
        System.out.println(name + " is teaching " + subject);
    }
}
