package edudrone;

import de.yadrone.base.ARDrone;
import de.yadrone.base.command.CommandManager;

public class EduDrone {

  private final ARDrone mARDrone;
  private final CommandManager mCommandManager;

  public EduDrone() {
    mARDrone = new ARDrone();
    mARDrone.start();
    mCommandManager = mARDrone.getCommandManager();
    mCommandManager.takeOff();
  }

  public void move() {
    mCommandManager
        .forward(10)
        .doFor(1000)
        .freeze()
        .doFor(5000);
  }

  public void shutdown() {
    if (mARDrone != null) {
      mCommandManager.landing();
      mARDrone.stop();
    }
  }

  public void wait(int millis) {
    mCommandManager.waitFor(millis);
  }

  @Override
  protected void finalize() throws Throwable {
    shutdown();
    super.finalize();
  }
}
