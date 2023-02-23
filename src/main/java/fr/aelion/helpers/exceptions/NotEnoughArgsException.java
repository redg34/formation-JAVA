package fr.aelion.helpers.exceptions;

public class NotEnoughArgsException extends Exception {
    public NotEnoughArgsException(){
        super("title of duration was not provided");
    }
}
