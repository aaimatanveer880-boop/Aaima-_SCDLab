
    class Students {
        String name;
        int roll_no;
    
        // Constructor to initialize student
        Students(String name, int roll_no) {
            this.name = name;
            this.roll_no = roll_no;
        }
    
        // Display info method
        void displayInfo() {
            System.out.println("Student Name : " + name);
            System.out.println("Roll Number  : " + roll_no);
            System.out.println("------------------------");
        }
    }

