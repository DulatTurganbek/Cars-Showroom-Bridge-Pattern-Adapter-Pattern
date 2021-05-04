package Lab5;

public abstract class manufacturers {
    protected Type typesOfCar;
    public manufacturers(Type typesOfCar){
        this.typesOfCar = typesOfCar;
    }

    public Type getTypesOfCar() {
        return typesOfCar;
    }

    public void setTypesOfCar(Type typesOfCar) {
        this.typesOfCar = typesOfCar;
    }
    public void make(){
        typesOfCar.fill();
        typesOfCar.convert();
    }
    public abstract void Mnfcturer();



}
