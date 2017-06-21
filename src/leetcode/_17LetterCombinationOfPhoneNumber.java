package leetcode;
import java.util.*;
/**
 * Created by fdd on 2017/6/19.
 */
public class _17LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        if(digits == null || digits.length() == 0) return res;
        String[] map = {"0", "1", "abc","def","ghi","jkl","mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for(int i = 0; i < digits.length(); i++){
            int x = digits.charAt(i) - '0';
            while(res.peek().length() == i){
                String tmp = res.remove();
                for(char s : map[x].toCharArray()){
                    res.add(tmp + s);
                }
            }
        }
        return res;
    }
}
