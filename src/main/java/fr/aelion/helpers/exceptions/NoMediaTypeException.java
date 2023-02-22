package fr.aelion.helpers.exceptions;

public class NoMediaTypeException extends Exception {
    public  NoMediaTypeException(){
        super("No type as was passed to Media");
    }
}
