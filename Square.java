public class Square extends Rectangle{
    public Square(String c, double side){
        super(c, side, side);
    }

    @Override
    public void displayDetails(){
        System.out.printf("This is a "+ this.color+" square");
    }
}
