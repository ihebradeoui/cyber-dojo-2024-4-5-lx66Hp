// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzerTest {

    @Test
    void checkAnswerElementsAre100()
    {
        assertEquals(100,FizzBuzzer.answer().size());
    }
    @Test
    void checkMultiplesOf5AllEqualToBuzz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=4; i<actual.size();i+=5)
                {
                    if(i%3!=0) //check if it's not a multiple of 3 . because in that case we want a 'FizzBuzz'
                    assertEquals("Buzz",actual.get(i));
                }
     }
    
    @Test
    void checkMultiplesOf3AllEqualToFizz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=2; i<actual.size();i+=3)
                {
                    if(i%5!=0) //check if it's not a multiple of 5 . because in that case we want a 'FizzBuzz'
                    assertEquals("Fizz",actual.get(i));
                }
     }
    
    @Test
    void checkMultiplesOf3And5AllEqualToFizzBuzz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=14; i<actual.size();i+=15)
                {
                    assertEquals("FizzBuzz",actual.get(i));
                }
     }
}
