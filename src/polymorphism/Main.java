package polymorphism;

public class Main {
    public static void main (String[]args){
        Calculator cal= new Calculator();
        System.out.println(cal.add(3,5));
        System.out.println( cal.add(2.0,3.0));
        System.out.println(cal.add(3,5,7));
        System.out.println(cal.add("prerana","basak"));
    }
}
