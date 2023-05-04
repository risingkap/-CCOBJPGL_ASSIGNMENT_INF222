package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("wow MERCURY");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("WOW  MARS");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("WOW  SATURN");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("WOW  NEPTUNE");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("WOW PLUTO");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("WOW EARTH");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("WOW VENUS");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("WOW URANUS");
    }

}