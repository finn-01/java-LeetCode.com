package easy;

import java.util.HashMap;

public class RomanToInteger1 {
    public int romanToInt(String s){
        if(s == null || s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        hashMap.put('I',1 );
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        //System.out.println(hashMap);

        int len = s.length();
        System.out.println(len);
        int result = hashMap.get(s.charAt(len - 1));
        System.out.println(result);

        for(int i = len - 2; i >= 0; i--){
            if(hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i + 1))){
                result += hashMap.get(s.charAt(i));
            }
            else {
                result -= hashMap.get(s.charAt(i));
                System.out.println(result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger1 romanToInteger1 = new RomanToInteger1();
        System.out.println(romanToInteger1.romanToInt("XIX"));
    }
}
