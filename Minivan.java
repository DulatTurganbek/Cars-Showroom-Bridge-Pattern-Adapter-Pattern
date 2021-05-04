package Lab5;

public class Minivan implements Type {
    int mile = 115;
    @Override
    public double convert() {
        return mile*1.6;
    }

    @Override
    public void fill() {
        System.out.println("Minivan speed is in kilometer:" + convert());
    }



}
