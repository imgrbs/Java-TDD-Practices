package taehub.cars;

import taehub.cars.models.*;

public class Driver {
  public static void main(String[] args) {
      Car mycar = new Elon();
      Engine engine = new Engine400();
      engine.setPower(200);
      mycar.setEngine(engine);
      mycar.setSpeed(60);
      System.out.println(mycar.getSpeed());
      System.out.println(mycar.getEngine().getPower());
  }
}
