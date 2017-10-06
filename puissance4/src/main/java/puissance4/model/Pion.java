package puissance4.model;

import java.awt.*;

public class Pion implements  Contenu {

    private Color couleur;
    private Pion(Color coul){
        couleur=coul;
    }
    public Pion rouge(){
        return new Pion(Color.RED);
    }

    public Pion jaune(){
        return new Pion(Color.yellow);
    }
}
