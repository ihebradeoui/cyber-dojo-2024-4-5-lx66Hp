
import java.util.List;
import java.util.ArrayList;
public class FizzBuzzer {

    public static List<String> answer() {
        List<String> numbers = new ArrayList<String>();
        for (int i =1 ; i<= 100 ; i++)
        {
             if(i%3==0 && i %5==0)
                numbers.add("FizzBuzz");
            else if(i%3==0)
                numbers.add("Fizz");
            else if(i%5==0)
                numbers.add("Buzz");
            else 
                numbers.add(i+"");
        }
        return numbers;
    }
}
