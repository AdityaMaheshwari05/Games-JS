
class Parent {

    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display(); // Calls Parent's display()

        Parent obj2 = new Child();
        obj2.display(); // Calls Child's overridden display()
    }
}
