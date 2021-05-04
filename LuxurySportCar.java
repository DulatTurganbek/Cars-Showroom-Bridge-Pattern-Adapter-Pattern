package Lab5;

public class LuxurySportCar implements Type {
    int mile = 220;
    @Override
    public double convert() {
        return mile*1.6;
    }
    @Override
    public void fill() {
        System.out.println("Luxury sport car speed is in kilometer:" + convert());
    }


}
