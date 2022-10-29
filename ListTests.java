import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testMerge(){ 
        List<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("mango");
        input1.add("pineapple");
        List<String> input2 = new ArrayList<>();
        input2.add("banana");
        input2.add("strawberry");
        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banana");
        expected.add("mango");
        expected.add("pineapple");
        expected.add("strawberry");
        assertEquals(expected, ListExamples.merge(input1, input2));
    }
}