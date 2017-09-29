package puissance4.exception;

public class ExceptionPionInconnu extends Exception{

    public ExceptionPionInconnu(String message){
        super(message + "Pion Inconnu\n");
    }
}
