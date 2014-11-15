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

  public void shutdown() {
    if (mARDrone != null) {
      mCommandManager.landing();
      mARDrone.stop();
    }
  }

  public void wait(int millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
    }
  }

  @Override
  protected void finalize() throws Throwable {
    shutdown();
    super.finalize();
  }
}
