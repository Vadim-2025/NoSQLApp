package ru.netology.nosqlapp.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;

    @NotBlank(message = "Введите имя, оно не может быть пустым или содержать только пробелы")
    @Size(min = 2, max = 20, message = "Имя должно быть от 2 до 20 символов")
    private String name;

    @Email(message = "Неверный формат электронной почты")
    @NotBlank(message = "Введите Email, он не может быть пустым или содержать только пробелы")
    private String email;

    @Min(value = 8, message = "Возраст не может быть меньше 8")
    @Max(value = 120, message = "Возраст не может быть больше 120")
    private Integer age;
}
