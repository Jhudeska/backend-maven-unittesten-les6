import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
//        Person person = new Person();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        //Arrange
        Person person = new Person();

        //Act
        String name = person.getName();
        String lastName = person.getLastName();

        //Assert
        assertEquals("John", person.getName());
        assertEquals("Doe", person.getLastName());
    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        //Arrange
        Person person = new Person();

        //Act
        String name = person.getName();

        //Assert
        assertEquals("John", person.getName());
    }

    @Test
    void ageShouldAddOneYear() {
        //Arrange
        Person person = new Person("John", "Doe", 16);

        //Act
        int age = person.addAge();

        //Assert
        assertEquals(16 , age);
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        //Arrange
        Person person = new Person("john", "doe",21);

        //Act
//        String lastName = String.valueOf(person.isFirstLetterUpperCase(person.getLastName()));

        //Assert
        assertEquals("Doe", lastName);
    }


    @Test
    void givenAPartnerHasShouldReturnTrue () {
        //Arrange

        //Act

        //Assert
    }

    @Test
    void childShouldBeAddedToList () {
        //Arrange


        //Act

        //Assert
    }

}