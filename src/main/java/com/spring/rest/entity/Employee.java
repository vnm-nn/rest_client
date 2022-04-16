package com.spring.rest.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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
