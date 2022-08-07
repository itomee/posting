package com.example.httpechoservice.repository;

import com.example.httpechoservice.entity.IntClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntClassRepository extends CrudRepository<IntClass, String> {}
