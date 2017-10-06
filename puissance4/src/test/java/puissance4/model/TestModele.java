package puissance4.model;

import org.junit.Before;
import org.junit.Test;
import puissance4.exception.ExceptionColonneHorsBorne;
import puissance4.exception.ExceptionColonnePleine;
import puissance4.exception.ExceptionPionInconnu;

import static org.junit.Assert.*;

public class TestModele {

    private Modele model;

    @Before public void creeGrille(){
        model = new Modele();
    }

    @Test
    public void testEmpilPionVerifPos() throws ExceptionColonneHorsBorne, ExceptionPionInconnu, ExceptionColonnePleine {
        model.lacherPionDansColonne(Modele.PION_JAUNE,2);
        model.lacherPionDansColonne(Modele.PION_ROUGE,2);
        model.lacherPionDansColonne(Modele.PION_JAUNE,2);

        assertTrue(model.pionEnPosition(2,2)==Modele.PION_ROUGE);
        assertTrue(model.pionEnPosition(1,2)==Modele.PION_JAUNE);
        assertTrue(model.pionEnPosition(3,2)==Modele.PION_JAUNE);
        assertTrue(model.pionEnPosition(6,2)==Modele.CASE_VIDE);

    }

    @Test
    public void testViderGrille() throws ExceptionColonneHorsBorne, ExceptionPionInconnu, ExceptionColonnePleine {
        model.lacherPionDansColonne(Modele.PION_JAUNE,2);
        model.vider();

        assertTrue(model.pionEnPosition(1,2)==Modele.CASE_VIDE);
    }
}
