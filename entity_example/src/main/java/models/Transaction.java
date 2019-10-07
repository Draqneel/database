package models;

import lombok.Data;

@Data
public class Transaction {
    private User from;
    private User where;
    private String secure_signature;
    private int value;
    private String dateTime;
}
