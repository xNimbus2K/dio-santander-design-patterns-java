package models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static Bank instance;
    private List<Customer> customers;

    private Bank() {
        customers = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
