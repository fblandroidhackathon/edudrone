package edudrone;

public class EduDroneDriver {

  public static void main(String[] args) {
    EduDrone drone = new EduDrone();
    drone.wait(5000);
    drone.shutdown();
  }
}
