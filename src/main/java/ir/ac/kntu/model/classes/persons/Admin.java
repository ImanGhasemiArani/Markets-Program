package ir.ac.kntu.model.classes.persons;

import ir.ac.kntu.model.enums.AccountType;

public class Admin extends Account{
    public Admin(String id, String name, String username, String password) {
        super(id, name, username, password, AccountType.ADMIN);
    }

    @Override
    public String toString() {
        return "Type: " + getAccountType() +
                " |ID: " + getId() +
                " |Name: " + getName() +
                " |Username: " + getUsername() +
                " |Password: " + getPassword();
    }

}
