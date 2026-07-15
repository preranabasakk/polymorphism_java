package animals;

public class Main {
    public static  void main(String [] args){
        Animal a= new Bird();
        a.makeSound();
        Animal b= new Lion();
        b.makeSound();
        Animal c = new Snake();
        c.makeSound();
        Animal [] animals={new Bird(),new Snake(),new Lion()};
        for(Animal ab : animals)
            ab.makeSound();
    }
}
