package com.codegym.service.account;

import com.codegym.dao.account.AccountDAO;
import com.codegym.model.Account;

import java.util.List;

public class AccountService implements IAccountService {

    private static final AccountDAO ACCOUNT_DAO = new AccountDAO();

    @Override
    public List<Account> getAll() {
        return ACCOUNT_DAO.getAll();
    }

    @Override
    public boolean save(Account account) {
        return false;
    }

    @Override
    public boolean update(int id, Account account) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Account findById(int id) {
        return null;
    }
}
