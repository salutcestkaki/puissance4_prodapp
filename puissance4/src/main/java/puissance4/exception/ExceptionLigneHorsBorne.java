package puissance4.exception;

public class ExceptionLigneHorsBorne extends Exception {

    public ExceptionLigneHorsBorne (String message){
        super("Ligne "+ message + " : Hors Borne\n");
    }
}
