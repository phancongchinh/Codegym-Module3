package com.codegym.model;

public class Account {
    private int id;
    private String username;
    private String password;
    private AccountRole accountRole;

    public Account() {
    }

    public Account(int id, String username, String password, AccountRole accountRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountRole = accountRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountRole getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(AccountRole accountRole) {
        this.accountRole = accountRole;
    }
}
