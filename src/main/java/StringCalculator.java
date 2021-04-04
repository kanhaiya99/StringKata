public class StringCalculator {
    static  int countAdd=0;
    /**
     * Q1.The method can take 0, 1 or 2 numbers, and will return their sum
     * (for an empty string it will return 0)
     *
     * @param s
     * @return
     */
    public int addQ1(String s){
        int sum=0;
        if(s.length() == 1){
            sum = Integer.parseInt(s);
        }
        else if(s.length() == 3){
            char arr[]=s.toCharArray();
            sum = arr[0]-'0'+arr[2]-'0';
        }
        return sum;
    }

    /**
     * Q2. Allow the Add method to handle an unknown amount of numbers
     * @param s
     * @return
     */
    public int addQ2(String s){
        int sum=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i+=2){
            sum+=arr[i]-'0';
        }

        return sum;
    }

    /**
     * Q3. Allow the Add method to handle new lines between numbers (instead of commas).
     *      1. the following input is ok: “1\n2,3” == 6
     *      2. the following is INVALID input so do not expect it : “1,\n” (not need to write a
     * test for it)
     * @param s
     * @return
     */
    public int addQ3(String s){
        int sum=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i+=2){
            sum+=arr[i]-'0';
        }

        return sum;
    }

    /**
     * Q4. Support different delimiters:
     * to change a delimiter, the beginning of the string will contain a separate line
     * that looks like this:
     *       “//[delimiter]\n[numbers...]”
     *        for example
     *       “//;\n1;2” == 3
     *          since the default delimiter is ‘;’ .
     * Note: All existing scenarios and tests should still be supported
     * @param s
     * @return
     */
    public int addQ4(String s){
        int sum=0;

        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 48 && arr[i] <= 57){
                sum+=arr[i]-'0';
               // System.out.println(arr[i]);
            }

        }
        return sum;
    }

    /**
     * Q5. Calling Add with a negative number will throw an exception “negatives not allowed” -
     * and the negative that was passed.
     * @param s
     * @return
     */
    public int addQ5(String s){
        int sum=0;
        try {
            char arr[] = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 48 && arr[i] <= 57) {
                    sum += arr[i] - '0';
                    // System.out.println(arr[i]);
                }

            }
        }
        catch (Exception e){

        }
        return sum;
    }

    /**
     * Q6. If there are multiple negatives, show all of them in the exception message.
     * @param s
     * @return
     */
    public int addQ6(String s){
        int sum=0;
        try {
            char arr[] = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 48 && arr[i] <= 57) {
                    sum += arr[i] - '0';
                    // System.out.println(arr[i]);
                }

            }
        }
        catch (Exception e){

        }
        return sum;
    }

    /**
     * Q7. Using TDD, Add a method to StringCalculator
     *      called public int GetCalledCount()
     *      that returns how many times Add() was invoked.
     *      Remember - Start with a failing (or even non compiling) test.
     * @param s
     * @return
     */

    public int addQ7(String s){
        countAdd++;
        return 0;
    }
    public int getCalledCount(){
        return  countAdd;
    }
    /**
     *  Q8. Ignored because its is mention .NET Only
     * @param s
     * @return

    public int addQ8(String s){

        return 0;
    }
    */
    /**
     * Q9. Numbers bigger than 1000 should be ignored, for example:
     *      2 + 1001 == 2
     * @param s
     * @return
     */
    public int addQ9(String s){


        return 0;
    }

    /**
     * Q10. Delimiters can be of any length with the following format:
     *      “//[delimiter]\n”
     *      for example:
     *      “//[***]\n1***2***3” == 6
     * @param s
     * @return
     */
    public int addQ10(String s){

        return 0;
    }

    /**
     * Q11. Allow multiple delimiters like this:
     *      “//[delim1][delim2]\n”
     *       for example
     *      “//[*][%]\n1*2%3” == 6.
     * @param s
     * @return
     */
    public int addQ11(String s){

        return 0;
    }

    /**
     * Q12. make sure you can also handle multiple delimiters with length longer than one char
     *      for example
     *      “//[**][%%]\n1**2%%3” == 6.
     *
     * @param s
     * @return
     */
    public int addQ12(String s){

        return 0;
    }
}
