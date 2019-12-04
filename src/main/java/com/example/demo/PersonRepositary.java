package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import model.Person;

public interface PersonRepositary extends CrudRepository<Person, String>{

}
