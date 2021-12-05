package com.cab.management.CabManagement.repository;

import com.cab.management.CabManagement.entity.Cab;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository extends CrudRepository<Cab,String> {
}
