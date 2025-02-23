class Parent {
    int i;
    String str;
    Parent() {
        this.i = 0;
        this.str = "Parent";
        System.out.println("Parent default constructor");
    }
    Parent(int i, String str) {
        this.i = i;
        this.str = str;
        System.out.println("Parent parameterized constructor");
    }
    void display() {
        System.out.println("Parent i: " + i);
        System.out.println("Parent str: " + str);
    }
}
class Child extends Parent {
    int i;
    String str;
    Child() {
        super();
        this.i = 10;
        this.str = "Child";
        System.out.println("Child default constructor");
    }
    Child(int i, String str) {
        super(i, str);
        this.i = i + 10;
        this.str = str + " Child";
        System.out.println("Child parameterized constructor");
    }
    void display() {
        super.display();
        System.out.println("Child i: " + this.i);
        System.out.println("Child str: " + this.str);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.display();
        System.out.println();
        Child child2 = new Child(20, "Hello");
        child2.display();
    }
}