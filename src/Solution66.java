

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution66 {
    public static void main(String[] args) {

        int[] array= new int[]{1,9,9};
        plusOne(array);

    }
    public static int[] plusOne(int[] digits) {

            for (int i = digits.length-1; i >=0 ; i--) {
                if (digits[i]==9&&i==0){
                   List ar= new ArrayList();
                   for(int j:digits){
                       ar.add(j);
                   }
                   ar.remove(0);
                   ar.add(0,1);
                    ar.add(1,0);
                   return ar.stream().mapToInt(num-> (int) num).toArray();



                }
                else if (digits[i]<9){
                    digits[i]++;
                    return digits;
                }
                else {
                    digits[i]=0;
                }

            }

        return digits;

    }


}
