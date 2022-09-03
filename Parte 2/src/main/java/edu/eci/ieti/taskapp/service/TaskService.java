package edu.eci.ieti.taskapp.service;

import edu.eci.ieti.taskapp.entities.Task;

import java.util.List;

public interface TaskService
{
    Task create(Task task ) throws TaskServiceException;

    Task findById( String id ) throws TaskServiceException;

    List<Task> getAll() throws TaskServiceException;

    boolean deleteById( String id ) throws TaskServiceException;

    Task update( Task task, String id ) throws TaskServiceException;
}
