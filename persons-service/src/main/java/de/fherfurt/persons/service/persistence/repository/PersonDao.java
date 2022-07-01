package de.fherfurt.persons.service.persistence.repository;

import de.fherfurt.persons.service.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDao{
    /**
     * This Methode "findPersonUsingIteratorByPersonID" will find a Person from the ArrayList by the personId with an Iterator.
     * @param personId this Parameter is needed for the Searching
     * @return Optional (Person) with all her/his values
     */
    Optional findPersonBy(int personId);

    /**
     * This methode "findPersonAvatarBy" will find a Person Avatar from a HashMap through a personId - Key.
     * @param personId unique key of a person
     * @return byte Code which return a byte Array of a Person Avatar
     */
    byte[] findPersonAvatarBy(int personId);

    List<Person> findAllPersonWithDeletedFlag();
}
