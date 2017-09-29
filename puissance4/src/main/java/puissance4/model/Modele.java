package puissance4.model;

import java.util.ArrayList;

public class Modele {

    public static final int NB_COLS = 7;
    public static final int NB_LIG = 6;
    public static final int CASE_VIDE = 0;
    public static final int PION_JAUNE = 1;
    public static final int PION_ROUGE = 2;
    private ArrayList<ArrayList<Integer>> grille;

    public Modele(){
        grille = new ArrayList<ArrayList<Integer>>();
        for (int i = 0 ; i < NB_COLS ; i++){
            grille.add(new ArrayList<Integer>());
        }
    }

    public void lacherPionDansColonne(int pion, int col){
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

    public void vider(){
        for(ArrayList<Integer> ligne : grille){
            ligne.clear();
        }
    }


}
