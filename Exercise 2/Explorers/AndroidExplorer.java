package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("scanned mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("scanend mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("scanned saturn");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("scanned neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("scanned pluto");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("scanned earth");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("scanned venus");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("scanned uranus");
    }

}