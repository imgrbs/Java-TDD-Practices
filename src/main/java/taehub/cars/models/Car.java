package taehub.cars.models;

public class Car {
    int speed;
    Engine engine;

    public Car() {
    }

    public Car(int speed, Engine engine) {
        this.speed = speed;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
