package com.onetbank.onetbank.model;

import java.util.List;
public class Bank {
    private List<Customer> customers;

    public Bank(List<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
