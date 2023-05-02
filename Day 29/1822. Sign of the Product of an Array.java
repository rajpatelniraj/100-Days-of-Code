class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int num : nums){ 
            if(num>0)   product *= 1;
            if(num<0)   product *= -1;
            if(num==0) product = 0;
        
        }
        if(product==0)  return 0;
        return product>0?1:-1;
    }
}