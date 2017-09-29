package puissance4.exception;

public class ExceptionColonneHorsBorne extends Exception {

    public ExceptionColonneHorsBorne(String message){
        super(message + "Colonne Hors Borne\n");
    }
}
