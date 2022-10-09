package base.array;

public class Test {
    public static void main(String[] args) {
        ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();

        // 1.两数之和
        /*
        int[] nums = {2, 7, 11, 15};
        int[] ret = arrayAlgorithm.twpSum(nums, 9);
        System.out.println("["+ret[0]+","+ret[1]+"]");
        int[] nums = {3, 2, 4};
        int[] ret = arrayAlgorithm.twpSum(nums, 6);
        System.out.println("["+ret[0]+","+ret[1]+"]");
         */


        // 26.删除有序数组中的重复项
        /*
        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(arrayAlgorithm.removeDuplicates(nums));;
         */


        // 27. 移除元素
        /*
        int[] nums = {3,2,2,3};
        int length = arrayAlgorithm.removeElement(nums, 3);
        int[] nums = {0,1,2,2,3,0,4,2};
        int length = arrayAlgorithm.removeElement(nums, 2);
        System.out.println(length);
        for(int i=0; i<length; i++){
            System.out.print(nums[i] + " ");
        }
         */

        // 66. 加一
        /*
        int[] digits = {1,2,3};
        digits = arrayAlgorithm.plusOne(digits);
        for(int i=0; i<digits.length; i++){
            System.out.print(digits[i] + " ");
        }
         */

        // 136. 只出现一次的数字
//        int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};
        System.out.println(arrayAlgorithm.singleNumber(nums));
    }
}
