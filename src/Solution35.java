public class Solution35 {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums, int target) {
        int res=0;
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int middle=(left+right)/2;
            if (nums[middle]<target){
                left=middle+1;
            }
            else if (nums[middle]==target){
                return middle;
            }

            else {
                right=middle;

            }
            return left;

        }






        return left;

}
}
