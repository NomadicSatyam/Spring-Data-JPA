package com.springbootjpademo.repository;

import com.springbootjpademo.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
