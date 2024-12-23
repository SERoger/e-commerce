package org.openapitools.service.impl;

import org.openapitools.models.Customer;
import org.openapitools.repository.CustomerRepository;
import org.openapitools.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UUID createCustomer(Customer customer) {
        return customerRepository.save(org.openapitools.entity.Customer.builder()
                .id(UUID.randomUUID())
                .name(customer.getName())
                .phone(customer.getPhone())
                .build()).getId();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll().stream().map(customerEntityItem->{
            return new Customer(customerEntityItem.getId().toString(),customerEntityItem.getName(),customerEntityItem.getPhone());
        }).collect(Collectors.toList());
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findById(UUID.fromString(id))
                .map(customerEntityItem -> new Customer(customerEntityItem.getId().toString(), customerEntityItem.getName(), customerEntityItem.getPhone()))
                .orElse(null);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(UUID.fromString(id));
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(org.openapitools.entity.Customer.builder()
                .id(UUID.fromString(customer.getId()))
                .name(customer.getName())
                .phone(customer.getPhone())
                .build());
    }
}
