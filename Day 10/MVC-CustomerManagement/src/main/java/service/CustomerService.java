package service;

import model.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{

    //private constructor
    private CustomerService(){}

    //A nested class with responsibility of instantiating a unique instance
    private static class CustomerServiceHelper{
        private static final CustomerService INSTANCE = new CustomerService();
    }

    // public method getting the unique instance
    public static CustomerService getInstance() {
        return CustomerServiceHelper.INSTANCE;
    }

    private static final Map<Integer, Customer> customerMap = new LinkedHashMap<>();

    static {
        customerMap.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customerMap.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customerMap.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customerMap.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void add(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.replace(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }
}