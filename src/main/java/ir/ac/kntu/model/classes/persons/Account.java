package ir.ac.kntu.model.classes.persons;

import ir.ac.kntu.model.enums.AccountType;

import java.lang.IllegalArgumentException;
import java.util.Objects;

public class Account extends Person {
    private String username;
    private String password;
    private final AccountType accountType;

    public Account(String id, String name, String username, String password, AccountType accountType) {
        super(name,id);
        setUsername(username);
        setPassword(password);
        if (accountType == null) {
            throw new IllegalArgumentException("The account's type shouldn't be blank.");
        }
        this.accountType = accountType;
    }

    public void setUsername(String username) {
        if (!username.matches("[a-zA-Z0-9_]+")) {
            throw new IllegalArgumentException("The username should be a-z, A-Z, 0-9 and _ character");
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (!password.matches("[a-zA-Z0-9_]{4,}")) {
            throw new IllegalArgumentException("The password should be a-z, A-Z, 0-9 and _ character which is at least 4 characters.");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(getUsername(), account.getUsername()) && Objects.equals(getPassword(), account.getPassword()) && getAccountType() == account.getAccountType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getAccountType());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountType=" + accountType +
                '}';
    }

    public String toStringForKnow() {
        return  getAccountType() + " " + getUsername() + " " + getPassword();
    }
}
