package com.api;

import com.fasterxml.jackson.core.JsonToken;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "mike"),
                new Employee(2, "stallin"),
                new Employee(1, "adam")
        );

        employees.stream().map(e -> mapToDto(e)).collect(Collectors.toList());
    }
    static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}