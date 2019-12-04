package com.example.controller;

import java.util.Hashtable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Iterable<Person> getAll(){
		return ps.getAll();
	}
	@RequestMapping("{id}")
	public Optional<Person> getPerson(@PathVariable("id") String id){
		Optional<Person> p1 = ps.getPerson(id);
		return p1;
	}
	@RequestMapping("/add")
	public Person savePerson(@RequestBody Person p){
		ps.addPerson(p);
		return p;
	}
}
