package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    /*Since out PK is customerId, and we want only one mobile number linked to one account
    we need to check account exists with mobile number because of that we are writing this
    new custom method*/
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
