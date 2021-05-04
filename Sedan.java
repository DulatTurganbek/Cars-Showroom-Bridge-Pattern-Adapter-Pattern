package Lab5;

public class Sedan implements Type {
    int mile = 150;
    @Override
    public double convert() {
        return mile*1.6;
    }

    @Override
    public void fill() {
        System.out.println("Sedan speed is in kilometer:" + convert());

    }




}