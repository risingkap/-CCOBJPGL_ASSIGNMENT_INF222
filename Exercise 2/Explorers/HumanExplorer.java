package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println(":O EXPLRORING MERCURY");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println(":O EXPLRORING MARS");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println(":O EXPLRORING SATURN");

    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("EXPLORING NEPTUNE");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("EXPLORING PLUTO");
    }

    @Override
    public void visit(Earth earth ) {
        System.out.println("EXPLORING EARTH");
    }
   
    @Override
    public void visit(Venus venus) {
        System.out.println("EXPLORING VENUS");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("EXPLORING VENUS");
    }

}

