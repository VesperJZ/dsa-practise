class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> tripletset = new HashSet<>();
        for(int i=0; i<n-1; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int k = -(nums[i] + nums[j]);
                if(hashset.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(k);

                    Collections.sort(temp);
                    tripletset.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(tripletset);
        return ans;
        
    }
}