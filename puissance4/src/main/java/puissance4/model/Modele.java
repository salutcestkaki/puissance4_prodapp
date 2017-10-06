package puissance4.model;

import puissance4.exception.ExceptionColonneHorsBorne;
import puissance4.exception.ExceptionColonnePleine;
import puissance4.exception.ExceptionLigneHorsBorne;
import puissance4.exception.ExceptionPionInconnu;

import java.util.ArrayList;

public class Modele {

    public static final int NB_COLS = 7;
    public static final int NB_LIG = 6;
    public static final int CASE_VIDE = 0;
    public static final int PION_JAUNE = 1;
    public static final int PION_ROUGE = 2;
    private ArrayList<ArrayList<Pion>> grille;
    protected int nbPionJoue=0;

    public Modele(){
        grille = new ArrayList<ArrayList<Pion>>();
        for (int i = 0 ; i < NB_COLS ; i++){
            grille.add(new ArrayList<Pion>());
        }
    }

    public void lacherPionDansColonne(Pion pion, int col) throws ExceptionColonnePleine, ExceptionColonneHorsBorne, ExceptionPionInconnu {
        assurerNumeroColonne(col);
        assurerColonneNonPleine(col);
        if(grille.get(col-1).size() < NB_LIG){
            grille.get(col-1).add(pion);
        }
    }

    public Contenu pionEnPosition(int lig, int col){
        if(grille.get(col-1).size() > (lig-1) ){
            return grille.get(col-1).get(lig-1);
        }
        else return Vide.CASEVIDE;
    }

    public void vider() {
        for (ArrayList<Pion> ligne : grille) {
            ligne.clear();//jadore lanus
        }
    }

    public int nbPionJoue(){
        return nbPionJoue;
    }

    public void setNbPionJoue(int nb){
        nbPionJoue=nb;
    }

    public void assurerNumeroLigne (int lig) throws ExceptionLigneHorsBorne {
        if(lig<1 ||lig>NB_LIG){
            throw new ExceptionLigneHorsBorne(""+lig);
        }
    }

    public void assurerPionValide(int pion) throws ExceptionPionInconnu{
        if(pion<1 || pion >2){
            throw new ExceptionPionInconnu(""+pion);
        }
    }

    public void assurerNumeroColonne (int col) throws ExceptionColonneHorsBorne{
        if(col<1 ||col>NB_COLS){
            throw new ExceptionColonneHorsBorne(""+col);
        }
    }

    public void assurerColonneNonPleine(int col) throws ExceptionColonnePleine{
        if(colonnePleine(col)==true){
            throw new ExceptionColonnePleine(""+col);
        }
    }

    public boolean colonnePleine(int col){
        ArrayList<Pion> colonne = grille.get(col-1);
        System.out.println("michel1");
        if (colonne.isEmpty()){
            System.out.println("michel2");
            return false;
        }

        for (Pion ligne : colonne){
            System.out.println("michel3"+ligne);
            if (ligne != Pion.JAUNE || ligne !=Pion.ROUGE){
                return false;
            }
        }
        System.out.println("michel4");
        return true;
    }
}
