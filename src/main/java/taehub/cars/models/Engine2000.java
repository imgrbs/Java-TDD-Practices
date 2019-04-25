package taehub.cars.models;

public class Engine2000 implements Engine {
    private int power;
    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }
}
