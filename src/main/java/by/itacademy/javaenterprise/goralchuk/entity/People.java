package by.itacademy.javaenterprise.goralchuk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private long id;
    private String name;
    private String surname;
    private Pet pet;
}
