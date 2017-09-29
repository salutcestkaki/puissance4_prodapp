package puissance4.exception;

public class ExceptionColonnePleine extends Exception{

    public ExceptionColonnePleine(String message){
        super(message + " Colonne pleine\n");
    }
}
