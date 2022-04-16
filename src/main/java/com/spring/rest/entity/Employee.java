package com.spring.rest.entity;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {

    private int id;

    private String name;

    private String surname;

    private String department;

    private int salary;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
