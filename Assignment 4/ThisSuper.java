class Parent {
    int x;
    
    // Constructor with parameter
    Parent(int x) {
        this.x = x; // Using 'this' to refer to instance variable
        System.out.println("Parent Constructor: x = " + x);
    }
    
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int y;
    
    // Constructor with parameter
    Child(int x, int y) {
        super(x); // Calling Parent class constructor using 'super()'
        this.y = y; // Using 'this' to refer to instance variable
        System.out.println("Child Constructor: y = " + y);
    }
    
    void display() {
        super.show(); // Calling Parent class method using 'super'
        System.out.println("Child class method");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child obj = new Child(10, 20); // Creating object
        obj.display();
    }
}