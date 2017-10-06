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

    public ArrayList<ArrayList<Integer>> getGrille() {
        return grille;
    }

    private ArrayList<ArrayList<Integer>> grille;
    protected int nbPionJoue=0;

    public Modele(){
        grille = new ArrayList<ArrayList<Integer>>();
        for (int i = 0 ; i < NB_COLS ; i++){
            grille.add(new ArrayList<Integer>());
        }
    }

    public void lacherPionDansColonne(int pion, int col) throws ExceptionColonnePleine, ExceptionColonneHorsBorne, ExceptionPionInconnu {
        assurerNumeroColonne(col);
        assurerPionValide(pion);
        assurerColonneNonPleine(col);
        if(grille.get(col-1).size() < NB_LIG){
            grille.get(col-1).add(pion);
        }
    }

    public int pionEnPosition(int lig, int col){
        if(grille.get(col-1).size() > (lig-1) ){
            return grille.get(col-1).get(lig-1);
        }
        else return CASE_VIDE;
    }

    public void vider() {
        for (ArrayList<Integer> ligne : grille) {
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
        ArrayList<Integer> colonne = grille.get(col-1);
        System.out.println("michel1");
        if (colonne.isEmpty()){
            System.out.println("michel2");
            return false;
        }

        for (Integer ligne : colonne){
            System.out.println("michel3"+ligne);
            if (ligne != 1 || ligne !=2){
                return false;
            }
        }
        System.out.println("michel4");
        return true;
    }
}
