
public class Student {

    String name;
    int rollNo;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNo = rollNumber;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
