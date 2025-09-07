package ru.netology.nosqlapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseError {
    /**
     * Собщение об ошибке.
     */
    private String message;
    /**
     * Номер ошибки.
     */
    private int id;
}
