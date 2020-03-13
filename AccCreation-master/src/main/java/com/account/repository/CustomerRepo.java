package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
