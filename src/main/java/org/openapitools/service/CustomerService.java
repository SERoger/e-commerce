package org.openapitools.service;


import org.openapitools.models.Customer;
import java.util.List;
import java.util.UUID;

public interface CustomerService {
    UUID createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(String id);
    void deleteCustomer(String id);
    void updateCustomer(Customer customer);

}
