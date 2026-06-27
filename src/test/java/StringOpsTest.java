import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOpsTest {

    @Test
    @DisplayName("Should Reverse String")
    void reverse() {
        //arrange
        String input = "Hallo Novi!";

        //Act
        String output = StringOps.reverse(input);

        //Assert
        assertEquals("!ivoN ollaH", output);
    }
}