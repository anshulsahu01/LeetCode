class Solution {
    public int findKthPositive(int[] A, int k) {
//         int a[]=new int [k];
//         int ans=0;
//         int start=0;
//         int l=arr.length;
//         int end=arr[l-1];
//         while(start<end){
            
//             if(arr[start]!=start+1){
//                 a[ans]=start+1;
//                 ans++;
//             }
//             start++;
//         }
//         int ans1=a[k+1];
//         return ans1;
        
        
                int l = 0, r = A.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;

    }
}