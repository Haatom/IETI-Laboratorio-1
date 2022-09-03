package edu.eci.ieti.app.service;

public class UserServiceException extends Exception{
    public static final  String NOT_EXISTS = "El usuario no existe";

    public UserServiceException(String message,Exception exception){
        super(message,exception);
    }
    public UserServiceException(){
        super();
    }
    public UserServiceException(String message){
        super(message);
    }
}
