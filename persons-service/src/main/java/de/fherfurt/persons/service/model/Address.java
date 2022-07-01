package de.fherfurt.persons.service.model;
import lombok.*;
@Getter
@Setter
public class Address {

    private String street;
    private String city;
    private String zipCode;

    public Address() {}

    public Address( String street, String city, String zipCode ) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }



}
