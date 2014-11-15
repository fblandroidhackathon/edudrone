package edudrone;

public class EduDroneDriver {

  public static void main(String[] args) {
    EduDrone drone = new EduDrone();
    System.out.println("Hovering...");
    drone.wait(5000);

    /*System.out.println("Move 1");
    drone.move();

    System.out.println("Move 2");
    drone.move();

    System.out.println("Move 3");
    drone.move();*/

    System.out.println("Shutdown");
    drone.shutdown();
  }
}
