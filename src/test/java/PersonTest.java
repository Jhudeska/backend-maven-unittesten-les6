import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
        Person person = new Person();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        //Arrange
        Person person = new Person("Nick");

        //Act
        String name = person.getName();

        //Assert
        assertEquals("Nick", person.getName());
        assertEquals("Doe", person.getLastName());
    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        //Arrange


        //Act

        //Assert
    }

    @Test
    void ageShouldAddOneYear() {
        //Arrange


        //Act

        //Assert
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven () {
        //Arrange

        //Act

        //Assert
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