package puissance4;

import puissance4.exception.ExceptionColonneHorsBorne;
import puissance4.exception.ExceptionColonnePleine;
import puissance4.exception.ExceptionPionInconnu;
import puissance4.model.Modele;

public class Launch {
    public static void main(String[] args) throws ExceptionColonneHorsBorne, ExceptionPionInconnu, ExceptionColonnePleine {
        Modele model = new Modele();
        System.out.println(model.colonnePleine(1));
        model.lacherPionDansColonne(1,1);
        model.lacherPionDansColonne(1,1);
        model.lacherPionDansColonne(1,1);
        model.lacherPionDansColonne(1,1);
        model.lacherPionDansColonne(1,1);
        model.lacherPionDansColonne(1,1);
        System.out.println(model.pionEnPosition(1,1));
        System.out.println(model.pionEnPosition(2,1));
        System.out.println(model.pionEnPosition(3,1));
        System.out.println(model.pionEnPosition(4,1));
        System.out.println(model.pionEnPosition(5,1));
        System.out.println(model.pionEnPosition(6,1));
        System.out.println(model.colonnePleine(1));
    }
}
