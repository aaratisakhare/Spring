package service;

import java.util.Hashtable;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PersonRepositary;

import model.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonRepositary personRepository;
	PersonService(){
	}
	public Optional<Person> getPerson(String id) {
		Optional<Person> p1 = personRepository.findById(id);
		System.out.println(p1);
		return p1;
	}
	public Iterable<Person> getAll(){
		return personRepository.findAll();
	}
	public void addPerson(Person p){
		personRepository.save(p);
	}
}
