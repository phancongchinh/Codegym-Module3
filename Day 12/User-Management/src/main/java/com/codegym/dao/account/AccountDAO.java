package com.codegym.dao.account;

import com.codegym.dao.IDBConnection;
import com.codegym.model.Account;
import com.codegym.model.AccountRole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO implements IAccountDAO {

    private static final Connection CONNECTION = IDBConnection.getConnection();

    @Override
    public List<Account> getAll() {
        List<Account> accountList = new ArrayList<>();
        try {
            PreparedStatement statement = CONNECTION.prepareStatement("SELECT * FROM account");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                AccountRole accountRole = AccountRole.valueOf(resultSet.getString("password"));
                Account account = new Account(id, username, password, accountRole);
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList;
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
