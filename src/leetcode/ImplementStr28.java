package leetcode;

/**
 * Created by fdd on 2017/6/23.
 */
public class ImplementStr28 {
    public static void main(String[] args) {
        //return haystack.indexOf(needle);
        System.out.println(strStr("abcdef","eabc"));
    }

    public static int strStr(String haystack, String needle) {  //字符串的匹配，使用字符串自带的函数，indexOf()
        if(haystack == null || needle == null) return -1;

        int m = haystack.length();
        int n = needle.length();
        int i = 0, j = 0;
        while(i < m && j < n){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
        }
        return haystack.indexOf(needle);
//        if(j == n){
//            return (i - j);
//        }else{
//            //return -1;
//        }
    }

}
