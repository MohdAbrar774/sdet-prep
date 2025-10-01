public class TopKFrequentElement{

     public int[] topKFrequent(int[] nums, int k) {

  

     HashMap<Integer,Integer> freq = new HashMap<>();

     for(int i=0; i<nums.length; i++){

        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

     }   

     int n = freq.size();
     int[][] mapDesc = new int[n][2];
     int i=0;
     for(int key:freq.keySet()){
        mapDesc[i][0] = key;
        mapDesc[i][1] = freq.get(key);
        i++;
     }

     Arrays.sort(mapDesc,(a,b) -> Integer.compare(b[1],a[1]));
     
       int[] res = new int[k];
       for(i=0; i<k; i++){
        res[i] = mapDesc[i][0]; 
       }
  
     return res;
    }
}