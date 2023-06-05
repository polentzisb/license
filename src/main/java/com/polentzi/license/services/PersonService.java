package com.polentzi.license.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.polentzi.license.models.Person;
import com.polentzi.license.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
	
	public List<Person> allPeople() {
        return personRepository.findAll();
    }
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

}