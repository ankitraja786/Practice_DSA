 //Number of Sub-arrays With Odd Sum
Input: arr = [1,3,5]
Output: 4
Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4



class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd =0;
        int even =0;
        long ans =0;
        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
            if(sum%2==0){
                ans+=odd;
                even++;
            }else{
                ans+=1+even;
                odd++;
            }
            }
        return(int)(ans%(1000000007));
        }
        
    }
