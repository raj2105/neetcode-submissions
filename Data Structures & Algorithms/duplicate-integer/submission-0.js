class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let arr = [];
        for(let i=0;i<nums.length;i++){
            if(arr[nums[i]]>0)return true;
            if(!arr[nums[i]])arr[nums[i]]=0;
            arr[nums[i]]+=1;
        }
        return false;
        
    }
}
