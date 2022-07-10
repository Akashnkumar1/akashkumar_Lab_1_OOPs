public class Circle extends Shape {

    double radius;
    final double pi = Math.PI;
    public Circle(String c, double radius) {
        super(c);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return pi*this.radius*this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*this.radius;
    }

    @Override
    public void displayDetails(){
        System.out.println("This is a "+this.color+" Circle");
    }
}