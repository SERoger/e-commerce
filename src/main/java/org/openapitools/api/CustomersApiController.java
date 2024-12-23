package org.openapitools.api;


import org.openapitools.models.Customer;
import org.openapitools.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

@Controller
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-22T16:29:22.836383600-05:00[America/New_York]", comments = "Generator version: 7.10.0")
@RequestMapping("${openapi.product.base-path:}")
public class CustomersApiController implements CustomersApi {

    private final NativeWebRequest request;

    @Autowired
    public CustomersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Autowired
    private CustomerService customerService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Customer>> customersGet() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> customersIdGet(String id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Void> customersPost(Customer customer) {
        UUID customerId = customerService.createCustomer(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(customerId).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


//    @Override
//    public ResponseEntity<List<Customer>> getAllCustomers() {
//        List<Customer> customers = customerService.getAllCustomers();
//        return new ResponseEntity<>(customers, HttpStatus.OK);
//    }
//
//    @Override
//    public ResponseEntity<Customer> getCustomerById(String id) {
//        Customer customer = customerService.getCustomerById(id);
//        if (customer != null) {
//            return new ResponseEntity<>(customer, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @Override
//    public ResponseEntity<Void> deleteCustomerById(String id) {
//        customerService.deleteCustomer(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @Override
//    public ResponseEntity<Void> updateCustomer(String id, Customer customer) {
//        customer.setId(id);
//        customerService.updateCustomer(customer);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }



}
