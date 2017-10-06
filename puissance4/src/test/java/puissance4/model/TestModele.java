package puissance4.model;

import org.junit.Before;
import org.junit.Test;
import puissance4.exception.ExceptionColonneHorsBorne;
import puissance4.exception.ExceptionColonnePleine;
import puissance4.exception.ExceptionPionInconnu;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static puissance4.model.Pion.JAUNE;
import static puissance4.model.Pion.ROUGE;
import static puissance4.model.Vide.CASEVIDE;

public class TestModele {

    private Modele model;

    @Before public void creeGrille(){
        model = new Modele();
    }

    @Test
    public void testEmpilPionVerifPos() throws ExceptionColonneHorsBorne, ExceptionPionInconnu, ExceptionColonnePleine {
        model.lacherPionDansColonne(JAUNE,2);
        model.lacherPionDansColonne(ROUGE,2);
        model.lacherPionDansColonne(JAUNE,2);

        assertTrue(model.pionEnPosition(2,2)==ROUGE);
        assertTrue(model.pionEnPosition(1,2)==JAUNE);
        assertTrue(model.pionEnPosition(3,2)==JAUNE);
        assertTrue(model.pionEnPosition(6,2)==CASEVIDE);
    }

    @Test
    public void testViderGrille() throws ExceptionColonneHorsBorne, ExceptionPionInconnu, ExceptionColonnePleine {
        model.lacherPionDansColonne(JAUNE,2);
        model.vider();

        assertTrue(model.pionEnPosition(1,2)==CASEVIDE);
    }
}
