package playingWithNumbers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testCheckPalindrome {

    @Test
    public void testPallindrome(){
        int checkNum = 123454321;
        int copyCheckNum = checkNum;
        int reverse = 0;
        while(copyCheckNum > 0){
            reverse = (reverse*10) + (copyCheckNum%10);
            copyCheckNum = copyCheckNum/10;
        }
        System.out.println("The original number is: " + checkNum);
        System.out.println("The reverse of the number is: " + reverse);

        Assert.assertEquals(checkNum, reverse, "The numbers are not palindrome");
        System.out.println("The numbers are palindrome");
    }
}
