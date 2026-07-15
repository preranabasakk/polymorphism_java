package shapes;

public class Main {
    public static void main (String[]args){
        Shape s1 = new Square();
        s1.draw();
        Shape s2 = new Hexagon();
        s2.draw();
        Shape s3 = new Shape();
        s3.draw();

    }
}
