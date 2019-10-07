package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Client extends User {
    private String address;
    private String digitalSignature;
    private Collection<Account> accounts;
}
