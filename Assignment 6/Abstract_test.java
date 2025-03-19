class Abstract_test{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();
    }
}

abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    double r=5;
    void area(){
        System.out.println("Area of Circle :"+3.14*r*r);
    }
}

class Rectangle extends Shape{
    int l=5;
    int b=7;
    void area(){
        System.out.println("Area of Rectangle :"+2*l*b);
    }
}