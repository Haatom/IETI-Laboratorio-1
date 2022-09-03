package edu.eci.ieti.taskapp.service;

public class TaskServiceException extends Exception {
    public static final String NOT_EXISTS = "The task doesn't exists";

    public TaskServiceException(String message, Exception exception) {
        super(message, exception);
    }

    public TaskServiceException() {
        super();
    }

    public TaskServiceException(String message) {
        super(message);
    }
}