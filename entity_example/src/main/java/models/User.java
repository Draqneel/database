package models;

import lombok.Data;

import java.util.Date;

@Data
abstract class User {
    private Date birthDate;
    private String login;
    private String hashPassword;
    private String fullName;
    private String phoneNumber;
    private String email;
}
