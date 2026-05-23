public class Main {
    public static void main(String[] args) {
        Person person = new Person("Somebody");
        System.out.println(("General".equals(Polymorphism.getStudentRole(person))));

        Student student = new Student("Someone", "207207207");;
        System.out.println("Student".equals(Polymorphism.getStudentRole(student)));
    }
}

// OTHER VERSION THAT ACTUALLY DOES WHAT THEY SAY - ASK ON PIAZZA!!! -
// THE VERSION ABOVE IS THE BETTER DESIGN BUT I AM SO CONFUSED WHAT THEY ARE ASKING ABOUT,
// CAUSE I THINK THIS VERSION DOES WHAT THEY ARE ASKING ABOUT, BUT IT'S WEIRD.
public class Polymorphism {
    // TODO TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
public static String getStudentRole(Person p) {
    // 1. Check if the Person object is actually an instance of Student
    if (p instanceof Student) {
        // 2. Cast p to a Student so we can access Student's specific fields
        Student s = (Student) p;
        return s.role;
    }

    // Fallback for a regular Person
    return p.role;
}
}

class Person {
    public final String role = "General";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Student extends Person {
    // 3. FIX: Changed "General" to "Student" so it actually returns the right role!
    public final String role = "Student";
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}
