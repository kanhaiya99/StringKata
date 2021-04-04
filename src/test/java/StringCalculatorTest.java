import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    // Test Method for Q1
    @Test
    public void addTestQ1(){
        StringCalculator strCal=new StringCalculator();
        int expected;
        int actual;
        // Test Case 1 for Empty String (0 value)
        expected = 0;
        actual=strCal.addQ1("");
        assertEquals(expected,actual,"The Actual value is 0 ");

        // Test Case 2 for String 1 value
        expected = 6;
        actual=strCal.addQ1("6");
        assertEquals(expected,actual,"The Actual value is 6 ");

        // Test Case 3 for String 2 value
        expected = 16;
        actual=strCal.addQ1("9,7");
        assertEquals(expected,actual,"The Actual value is 16 ");
    }
    @Test
    public void addTestQ2(){
        StringCalculator strCal=new StringCalculator();
        int expected;
        int actual;
        // Test Case 1
        expected = 28;
        actual=strCal.addQ2("1,2,3,4,5,6,7");
        assertEquals(expected,actual,"The Actual value is 0 ");

    }
    @Test
    public void addTestQ3(){
        StringCalculator strCal=new StringCalculator();
        int expected;
        int actual;
        // Test Case 1
        expected = 28;
        actual=strCal.addQ3("1\n2,3,4,5,6,7");
        assertEquals(expected,actual,"The Actual value is 0 ");


    }
    @Test
    public void addTestQ4(){
        StringCalculator strCal=new StringCalculator();
        int expected;
        int actual;
        // Test Case 1
        expected = 3;
        actual=strCal.addQ4("//;\n1;2");
        assertEquals(expected,actual,"The Actual value is 3 ");
    }
    @Test
    public void addTestQ5(){
        StringCalculator strCal=new StringCalculator();
        int expected;
        int actual;
        // Test Case 1
        expected = 3;
        actual=strCal.addQ5("//;\n1;2");
        assertEquals(expected,actual,"negatives numbers are not allowed ");

    }
    public void addTestQ6(){
        StringCalculator strCal=new StringCalculator();


    }
    public void addTestQ7(){
        StringCalculator strCal=new StringCalculator();


    }
    public void addTestQ9(){
        StringCalculator strCal=new StringCalculator();


    }
    public void addTestQ10(){
        StringCalculator strCal=new StringCalculator();


    }
    public void addTestQ11(){
        StringCalculator strCal=new StringCalculator();


    }
    public void addTestQ12(){
        StringCalculator strCal=new StringCalculator();


    }
}
