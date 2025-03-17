
public class GraduateStudent extends Student {

    String researchTopic;

    // Constructor
    public GraduateStudent(String name, int rollNo, double marks, String researchTopic) {
        super(name, rollNo, marks); // Calling Student class constructor
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Student class method
        System.out.println("Research Topic: " + researchTopic);
    }

    // Main method to test
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent("Arya", 404, 82.5, "AI in Medical Research");
        grad.displayInfo();
    }
}
