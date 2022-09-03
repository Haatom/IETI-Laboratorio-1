package edu.eci.ieti.app.service;

import edu.eci.ieti.app.entities.User;

import java.util.List;

public interface UserService
{
    User create(User user ) throws UserServiceException ;

    User findById( String id ) throws UserServiceException;

    List<User> getAll() throws UserServiceException;

    void deleteById( String id ) throws UserServiceException;

    User update( User user, String userId ) throws UserServiceException;
}
