package com.alok.Demo_Project.exception;

public class UserNotFoundException extends RuntimeException  {
    public UserNotFoundException(Long id) {
       super("Could not found the user with Id: "+ id);
    }
}
