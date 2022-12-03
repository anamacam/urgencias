package org.adaurgencias.repository;

import org.adaurgencias.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String> {
}
