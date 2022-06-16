import  java.util.*;


class Solution {
    public static void main(String[] args) {
        String[] arr= new String[]{"ab","a"};
        System.out.println(longestCommonPrefix(arr));


    }
    public static String longestCommonPrefix(String[] strs) {

        if (strs==null||strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        String res="";
        Arrays.sort(strs);
        char [] first= strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for (int i = 0; i <first.length ; i++) {
            if (first[i]==last[i]){
                res+=first[i];
            }
            else {System.out.println(res);
                return res;
            }

        }
        return res;

    }
}