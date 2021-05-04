package Lab5;

public class Main {
    public static void main(String[] args) {
       manufacturers car = new Europe(new Sedan());
       car.Mnfcturer();
       car.make();

       manufacturers car1 = new US(new Minivan());
        car1.Mnfcturer();
       car1.make();

       manufacturers car2 = new US(new LuxurySportCar());
       car2.Mnfcturer();
       car2.make();

    }
}
