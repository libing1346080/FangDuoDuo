package leetcode;
import java.util.*;
/**
 * Created by fdd on 2017/6/21.
 */
public class _22GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        if(n <= 0) return res;
        parenthesisCore(res, "", 0, 0, n);
        return res;
    }
    public static void parenthesisCore(List<String> res, String str, int left, int right, int max){
        if(str.length() == max *  2){
            res.add(str);
            return;
        }
        if(left < max){
            parenthesisCore(res, str + "(" , left + 1, right, max);
        }
        if(right < left){
            parenthesisCore(res, str + ")" , left, right + 1, max);
        }
    }
 }
