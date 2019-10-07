package models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Employee extends User {
    private Branch branch;
    private Role role;
    private int experience;
}
