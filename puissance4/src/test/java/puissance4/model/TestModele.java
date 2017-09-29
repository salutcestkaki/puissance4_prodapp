package puissance4.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestModele {

    @Test
    public void testEmpilPionVerifPos(){
        Modele model = new Modele();
        model.lacherPionDansColonne(Modele.PION_JAUNE,2);
        model.lacherPionDansColonne(Modele.PION_ROUGE,2);
        model.lacherPionDansColonne(Modele.PION_JAUNE,2);

        assertTrue(model.pionEnPosition(2,2)==Modele.PION_ROUGE);
        assertTrue(model.pionEnPosition(1,2)==Modele.PION_JAUNE);
        assertTrue(model.pionEnPosition(3,2)==Modele.PION_JAUNE);
        assertTrue(model.pionEnPosition(6,2)==Modele.CASE_VIDE);

    }
}
