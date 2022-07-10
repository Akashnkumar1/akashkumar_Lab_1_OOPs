public class Shape {
    //double area;
    String color;
    public Shape(String c){
        this.color = c;
    }

    public double calculateArea(){
        return 0.0;
    }

    public double calculatePerimeter(){
        return 0.0;
    } 

    public void displayDetails(){
        System.out.printf("This is a Shape with color", this.color);
    }
}
