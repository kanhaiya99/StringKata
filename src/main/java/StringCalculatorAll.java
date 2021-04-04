import java.util.ArrayList;

public class StringCalculatorAll {
    /**
     * countAdd variable
     */
    static  int countAdd=0;

    /**
     *
     * @param s
     * @return
     */
    public int add(String s){
        countAdd++;
        int sum=0;
        // Storing the negative numbers in ArrayList negative.
        ArrayList<Integer> negative=new ArrayList<>();
        try {
            // Converting the String to character array
            char numArr[] = s.toCharArray();
            int i=0;

            while(i < numArr.length){
                int num=0;
                int sign=1;
                while( i < numArr.length && numArr[i] >= '0' && numArr[i] <= '9'){
                    if(i-1 >= 0 && numArr[i-1] == '-')
                        sign=sign * -1;
                    num =num * 10 + numArr[i]-'0';
                    i++;
                }

                num *= sign;

                if(num > 1000){
                    num=0;
                }

                sum += num; // Adding the num to the sum

                if(num < 0){
                    negative.add(num);

                }
                i++;
            }
            /**
             * If any Negative Number found in the String s ,
             * then it will throw an NegativeException
             */
            if(negative.size() > 0){
                sum=0;
                throw new NegativeException(negative);
            }
        }
        /* Catch the NegativeException */
        catch (NegativeException n){
            System.out.println(n+" : "+"Negatives are not allowed");
        }
        /* The Default Exception */
        catch(Exception e){
            System.out.println(e);
        }
        return  sum;
    }

    /**
     * Get Total number of count the add() method called
     * @return
     */
    public int getCalledCount(){
        return countAdd;
    }
}

/**
 * Default Class for NegativeException
 */
class NegativeException extends  Exception{
    public NegativeException(ArrayList<Integer> negative){
         System.out.println(negative);
    }
}