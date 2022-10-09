package base.array;

public class ArrayAlgorithm {
    // 1. 两数之和
    // 暴力循环，另一种方法是使用哈希表
    public int[] twpSum(int[] nums, int target){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // 26. 删除有序数组中的重复项
    /**
     * nums是一个升序数组
     * @param nums
     * @return
     */
    // 删除数组nums中重复的值，并且返回新的数组
    // 快慢指针
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int slow=1, fast=1;
        while(fast < n){
            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    // 27. 移除元素
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left=0, right=0;
        while(right < n){
            if(nums[right] != val){
                nums[left] = nums[right];
                ++left;
                ++right;
            }else{
                ++right;
            }
        }
        return left;
    }

    // 66. 加一
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        digits[n] += 1;
        if(n==0){
            if(digits[n] == 10){
                return new int[]{1, 0};
            }
            return digits;
        }
        for(int i=n; i>0; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }else{
                return digits;
            }
        }
        if(digits[0] == 10){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
    // 另外一种方法是看数组后面出现几个9，因为思路差不多，所以这里不再重复这种算法。

    // 136. 只出现一次的数字
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for(int i=1; i<nums.length; i++){
            ret ^= nums[i];
        }
        return ret;
    }
}
