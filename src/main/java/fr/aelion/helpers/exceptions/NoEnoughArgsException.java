package fr.aelion.helpers.exceptions;

public class NoEnoughArgsException extends Exception {
    public  NoEnoughArgsException(){
        super("title of duration was not provided");
    }
}
