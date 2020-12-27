package com.dstym.springbootrestapiin5minutes.repository;

import com.dstym.springbootrestapiin5minutes.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
