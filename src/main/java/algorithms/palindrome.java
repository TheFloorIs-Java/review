package algorithms;

public class palindrome {
    public static void main(String[] args) {
        palindrome pal = new palindrome();
        System.out.println("tests for method 1:");
        pal.testPalindrome1racecar();
        pal.testPalindrome1cat();
        System.out.println("tests for method 2:");
        pal.testPalindrome2racecar();
        pal.testPalindrome2cat();
    }
    /**
     * this method will check if a string is a palindrome (a palindrome is a word that is the same forwards
     * as it is backwards)
     * @param str the string we will be checking.
     * @return true if str is palindrome, false otherwise.
     */
    public boolean checkPalindrome1(String str){
        /*
        solution 1: check the first element against the last element, the second against the second to last, etc
        until we get to the middle of str.

        solution 2: we can make a new string which is the reverse of str and then check if str is equal to the reverse

        racecar
        0123456
        str.length=7

        if we're able to get to the middle of str without encountering anything that disproves that the string
        is a palindrome, it's save to say that the string is a palindrome. return false.
        that point, however, will only be when we complete the for loop.
         */
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//                if i kow that the left side char is not equal to the right side char, i know for sure that the string
//                could not be a palindrome. so, we can immediately return false.
                return false;
            }
        }
        return true;
    }
    public boolean checkPalindrome2(String str){
        /*
        in order to reverse, the most clean way (apart from just using stringbuilder.reverse()) is to start off with a blank
        string, and gradually add elements from the right of the input string.

        we could also have a for loop like int i = str.length()-1; i >= 0; i--)
         */
        String strReverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            strReverse = strReverse+str.charAt(i);
        }
        if(str.equals(strReverse)){
            return true;
        }else{
            return false;
        }
    }

    public void testPalindrome1racecar(){
        String input = "racecar";
        boolean expected = true;
        boolean actual = checkPalindrome1(input);
        if(expected == actual){
            System.out.println("passed test on input "+input);
        }else{
            System.out.println("failed test on input "+input+" actual result: "+actual+" should be: "+expected);
        }
    }
    public void testPalindrome1cat(){
        String input = "cat";
        boolean expected = false;
        boolean actual = checkPalindrome1(input);
        if(expected == actual){
            System.out.println("passed test on input "+input);
        }else{
            System.out.println("failed test on input "+input+" actual result: "+actual+" should be: "+expected);
        }
    }
    public void testPalindrome2racecar(){
        String input = "racecar";
        boolean expected = true;
        boolean actual = checkPalindrome2(input);
        if(expected == actual){
            System.out.println("passed test on input "+input);
        }else{
            System.out.println("failed test on input "+input+" actual result: "+actual+" should be: "+expected);
        }
    }
    public void testPalindrome2cat(){
        String input = "cat";
        boolean expected = false;
        boolean actual = checkPalindrome2(input);
        if(expected == actual){
            System.out.println("passed test on input "+input);
        }else{
            System.out.println("failed test on input "+input+" actual result: "+actual+" should be: "+expected);
        }
    }
}
