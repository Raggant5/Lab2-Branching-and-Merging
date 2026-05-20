public class Polymorphism {
    // TODO TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        // Calling the method allows Java to dynamically look up the correct subclass implementation
        return p.getRole();
    }
}

class Person {
    private final String role = "General";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Added a getter method so subclasses can override it polymorphically
    public String getRole() {
        return this.role;
    }
}

class Student extends Person {
    private final String role = "Student"; // Changed from "General" to "Student"
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    // Overriding the getRole method to return the Student's role
    @Override
    public String getRole() {
        return this.role;
    }
}
