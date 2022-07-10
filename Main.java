public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Magenta", 3);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        c.displayDetails();
    }
}
