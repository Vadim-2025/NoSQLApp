package ru.netology.nosqlapp.exception;

public class ErrorFindUserException extends RuntimeException {
    public ErrorFindUserException(String msg) {
        super(msg);
    }
}
