package ru.netology.nosqlapp.exception;

public class ErrorInputDataException extends RuntimeException {
    public ErrorInputDataException(String msg) {
        super(msg);
    }
}
