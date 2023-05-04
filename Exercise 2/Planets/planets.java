package Planets;

import Explorers.Explorer;

public class planets implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}