package converter;

public class Converter {
    public double convert(int value){
        return (double) value;
    }
    public int convert(String value){
        return Integer.parseInt(value);
    }
}
