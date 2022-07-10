public class Rectangle extends Shape {
    double width, height;
    public Rectangle(String c, double width, double height) {
        super(c);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void displayDetails(){
        System.out.printf("This is a "+this.color+" Rectangle");
    }
}
