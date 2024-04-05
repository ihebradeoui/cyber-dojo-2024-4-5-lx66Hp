// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HikerTest {

    @Test
    void life_the_universe_and_everything() {
        List<String> actual = Hiker.answer();
        if(actual.size()<100)
            assertTrue(false);
        for (int i =0 ; i<actual.size(); i++)
        {
            int currentNumber=i+1;
            if(currentNumber%3==0 && currentNumber%5==0)
                assertEquals("FizzBuzz", actual.get(i));
            else if(currentNumber%3==0)
                assertEquals("Buzz", actual.get(i));
            else if(currentNumber%3==0)
                assertEquals("Buzz", actual.get(i));
            else 
                assertEquals(currentNumber+"", actual.get(i));
        }
        
     }
}
