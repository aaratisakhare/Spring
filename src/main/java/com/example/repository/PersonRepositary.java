package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Person;
@Repository
public interface PersonRepositary extends CrudRepository<Person, String>{

}
