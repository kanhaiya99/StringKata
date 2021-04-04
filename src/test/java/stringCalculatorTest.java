import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringCalculatorTest {
    @Test
    public  void addTest(){
        StringCalculator strCal=new StringCalculator();

        int expected;
        int actual;
        // Test Cases for Q1
        expected = 0;
        actual = strCal.add("");
        assertEquals(expected,actual);

        expected = 1;
        actual = strCal.add("1");
        assertEquals(expected,actual);

        expected = 3;
        actual = strCal.add("1,2");
        assertEquals(expected,actual);

        expected = 13;
        actual = strCal.add("1,2,10");
        assertEquals(expected,actual);

        // Test Cases for Q2
        expected = 125;
        actual = strCal.add("1,2,4,53,33,32");
        assertEquals(expected,actual);

        expected = 180;
        actual = strCal.add("16,9,99,56");
        assertEquals(expected,actual);

        expected = 1442;
        actual = strCal.add("1,2,998,432,9");
        assertEquals(expected,actual);

        // Test Cases for Q3
        expected = 6;
        actual = strCal.add("1\n2,3");
        assertEquals(expected,actual);

        expected = 16;
        actual = strCal.add("1\n2,3\n9,1");
        assertEquals(expected,actual);

        // Test Cases for Q4

        expected = 3;
        actual = strCal.add("//;\\n1;2");
        assertEquals(expected,actual);



        // Test Cases for Q5
        expected = 0;
        actual = strCal.add("//;\\n1;2;-3");
        assertEquals(expected,actual);

        expected = 0;
        actual = strCal.add("//;\\n-1;2;3");
        assertEquals(expected,actual);



        // Test Cases for Q6

        expected = 0;
        actual = strCal.add("1;2;-3;-6,9,-18,-7");
        assertEquals(expected,actual);

        expected = 0;
        actual = strCal.add("-1;2;-3;-6,9,-18,7");
        assertEquals(expected,actual);




        // Test Cases for Q7
        System.out.println("add() called : "+strCal.getCalledCount()+" Number of times");



        // Test Cases for Q9
        expected = 3;
        actual = strCal.add("1,2000;1001;2");
        assertEquals(expected,actual);


        expected = 23;
        actual = strCal.add("1,20;1001;2");
        assertEquals(expected,actual);



        // Test Cases for Q10
        expected = 6;
        actual = strCal.add("//[***]\\n1***2***3");
        assertEquals(expected,actual);

        expected = 91;
        actual = strCal.add("//[***]\\n1***72***9***9");
        assertEquals(expected,actual);


        // Test Cases for Q11
        expected = 6;
        actual = strCal.add("//[*][%]\\n1*2%3");
        assertEquals(expected,actual);


        expected = 17;
        actual = strCal.add("//[*][%]\\n1*2%3*4%7");
        assertEquals(expected,actual);


        // Test Cases for Q12

        expected = 6;
        actual = strCal.add("//[**][%%]\\n1**2%%3");
        assertEquals(expected,actual);

        expected = 106;
        actual = strCal.add("//[**][%%]\\n1**2%%3**88%%12");
        assertEquals(expected,actual);

    }
}
