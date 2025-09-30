import java.util.HashMap;

public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            int currFreq = map.get(nums[i]);
            if(currFreq > nums.length/2 ){
                return nums[i];
            }
        }

        return -1;
    }
}
