package de.fherfurt.persons.service.resources;


import java.util.ArrayList;

//TODO @Milena: Try it by yourself
/**
 * @author Milena Neumann
 * The Person Class is the place where the input from the user gets
 * checked and put into a list for the following service
 */
public class Person
{

    private String inFirstName;
    private String inLastName;
    private String inMajor;
    private String inFaculty;
    ArrayList<String> personInputData = new ArrayList<>();

    public Person(String inFirstName, String inLastName, String inMajor, String inFaculty)
    {
        this.inFirstName = inFirstName;
        this.inLastName = inLastName;
        this.inMajor = inMajor;
        this.inFaculty = inFaculty;
    }

}








