package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //dieu kien sai
        if(x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }

        int rev = 0;

        while (x > rev){
            //dao nguoc lai so
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        //11 == 11 return true, 121 = 121 return true
        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(1221));
    }
}
