package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    void add(Customer customer);

    void update(int id, Customer customer);

    void remove(int id);

    Customer findById(int id);
}