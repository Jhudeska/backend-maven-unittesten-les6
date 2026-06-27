package Sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PesonJunitTest {

    @Test
    void shouldReturnFirstName(){
        //Arrange
        PesonJunit person = new PesonJunit("Jan", "Jansen", 25);

        // Act
        String firstName = person.getFirstName();

        // Assert
        assertEquals("Jan", firstName);
    }

    @Test
    void shouldReturnAge(){
        //Arrange
        PesonJunit person = new PesonJunit("Jan", "Jansen", 25);

        // Act
        int age = person.getAge();

        // Assert
        assertEquals(25, age);

    }

    @Test
    void shouldReturnFullName(){
        //Arrange
        PesonJunit person = new PesonJunit("Jan", "Jansen", 25);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Jan Jansen", fullName);
    }

@Test
    void shouldBeAdultWhenAgeIs180OrMore(){
        // Arrange
        PesonJunit person = new PesonJunit("Lisa", "Pieters", 16);

        // Act
        Boolean adult = person.isAdult();

        // Assert
        assertFalse(adult);
    }

    @Test
    void shouldCheckBirthday(){
        // Arrange
        PesonJunit person = new PesonJunit("Lisa", "Pieters", 16);

        // Act
        Boolean birthday = person.hasBirthday();

        // Assert
        assertTrue(birthday);
    }






}