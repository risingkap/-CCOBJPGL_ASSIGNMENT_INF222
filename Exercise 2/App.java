import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune ();
        Planet earth = new Earth ();
        Planet uranus = new Uranus ();
        Planet venus = new Venus ();
        Planet pluto = new Pluto () ;

        Explorer astronaut = new HumanExplorer();
        Explorer b2 = new RobotExplorer();
        Explorer DROID = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        earth.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);
        pluto.accept(astronaut);

        mars.accept(b2);
        saturn.accept(b2);
        mercury.accept(b2);
        neptune.accept(b2);
        earth.accept(b2);
        uranus.accept(b2);
        venus.accept(b2);
        pluto.accept(b2);

        mars.accept(DROID);
        saturn.accept(DROID);
        mercury.accept(DROID);
        neptune.accept(DROID);
        earth.accept(DROID);
        uranus.accept(DROID);
        venus.accept(DROID);
        pluto.accept(DROID);

    }
}