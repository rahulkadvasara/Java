class Base {
    public void display() {
        System.out.println("Display method in Base class");
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("Display method in Derived class");
    }
    public void display(int a) {
        System.out.println("Display method in Derived class with parameter: " + a);
    }
}

class Polymorphism {

    Polymorphism() {
        System.out.println("Default constructor");
    }

    Polymorphism(int a) {
        System.out.println("Constructor with one parameter: " + a);
    }

    public static void main(String[] args) {

        new Polymorphism();
        new Polymorphism(5);

        Base base = new Base();
        base.display();

        Derived derived = new Derived();
        derived.display();
        derived.display(5);
    }
}