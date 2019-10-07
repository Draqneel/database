package models;

import lombok.Data;

import java.util.Collection;

@Data
public class Branch {
    private String address;
    private Collection<Employee> employees;
}
