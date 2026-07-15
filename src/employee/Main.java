package employee;

public class Main {
    public static void main(String [] args){
        Employee e = new Developer();
        e.work();
        Employee design = new Desinger ();
        design.work();
        Employee a = new Employee();
        a.work();
    }
}
