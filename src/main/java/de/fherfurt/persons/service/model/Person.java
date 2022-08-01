package de.fherfurt.persons.service.model;


import de.fherfurt.persons.service.persistence.core.AbstractDatabaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * The class Person includes all information of Person. A person is build by the Builder Pattern and generated by Lombok
 * Kind of Person: otherEmployee,lecturer,student
 * @author  Tran Anh Hoang
 * @version  1.0.0.0
 * @since 1.0.0.0
 */

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Person extends AbstractDatabaseEntity {


    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String title;
    private String hireDate;
    private String faculty;
    private Boolean teachingFlag;
    private String room;
    private String major;
    private String immatriculationDate;
    private String exmatriculationDate;
    private Boolean tutorFlag;
    private Boolean scientificWorkerFlag;
    private String jobTitle;
    private Boolean deletedFlag;

    @ManyToOne( cascade = CascadeType.PERSIST )
    private Address address;

    /*
    @OneToOne
    private PersonAvatar avatar;

    protected Person() {}


    @OneToOne
    private Faculty facultyName;


    /**
     * Function to create an employee with the needed parameters from person
     * @return a new person instance that only requires the specific parameters for an employee
     */
    //only needed for other employees
    public static Person otherEmployee( String firstname,String lastname,String email,String jobTitle, boolean deletedFlag){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).setJobTitle(jobTitle).setDeletedFlag(deletedFlag).build();
    }

    /**
     * Function to create a lecturer with the needed parameters from person
     * @return a new person instance that only requires the specific parameters for a lecturer
     */
    //only needed for lecturers
    public static Person lecturer(int personId, String firstname,String lastname,String email,String phonenumber, String title, String hireDate, String faculty, Boolean teachingFlag, String room, boolean deletedFlag){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).
                setPhonenumber(phonenumber).setTitle(title).setHireDate(hireDate).setFaculty(faculty).setRoom(room).
                setTeachingFlag(teachingFlag).setRoom(room).setDeletedFlag(deletedFlag).build();
    }

    /**
     * Function to create a student with the needed parameters from person
     * @return a new person instance that only requires the specific parameter for a student
     */
    //only needed for students
    public static Person student(String firstname,String lastname,String email,String major, String immatriculationDate, String exmatriculationDate, Boolean tutorFlag, Boolean scientificWorkerFlag, boolean deletedFlag, Address address){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).setMajor(major).setImmatriculationDate(immatriculationDate).setExmatriculationDate(exmatriculationDate).setTutorFlag(tutorFlag).setScientificWorkerFlag(scientificWorkerFlag).setDeletedFlag(deletedFlag).setAddress(address).build();
    }

}