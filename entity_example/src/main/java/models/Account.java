package models;

import lombok.Data;

import java.sql.Date;

@Data
public class Account {
    private String type;
    private Date creatingDate;
    private int capitalization;
    private int balance;
}
