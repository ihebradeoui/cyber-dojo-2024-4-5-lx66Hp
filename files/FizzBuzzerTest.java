// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzerTest {

    @Before
    void checkAnswerElementsAre100()
    {
        assertEquals(100,FizzBuzzer.answer().size());
    }
    @Test
    void checkMultiplesOf5AllEqualToBuzz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=4; i<actual.size();i+=5)
                {
                    asserEquals("Buzz",actual.get(i));
                }
     }
    
    @Test
    void checkMultiplesOf3AllEqualToFizz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=2; i<actual.size();i+=3)
                {
                    asserEquals("Fizz",actual.get(i));
                }
     }
    
    @Test
    void checkMultiplesOf3And5AllEqualToFizzBuzz() {
        List<String> actual = FizzBuzzer.answer();
                for (int i=14; i<actual.size();i+=15)
                {
                    asserEquals("FizzBuzz",actual.get(i));
                }
     }
}
