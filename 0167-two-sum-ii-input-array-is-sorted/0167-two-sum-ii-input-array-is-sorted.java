class Solution {
    public int[] twoSum(int[] num, int target) {
      
        
        // int[] index =new int[2];
        
        
         int[] indice = new int[2];
        indice[0]=1;
        indice[1]=2;
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            indice[0] = left + 1;
            indice[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return indice; 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         List<Integer> ls=new ArrayList<>();
        
//         int sum=0;
        
//         for(int i=0;i<numbers.length-1;i++){
            
//             for(int j=i+1;j<numbers.length;j++){
//                 sum =sum+ numbers[i]+numbers[j];
                
//                 if(sum==target){
//                     ls.add(i+1);
//                     ls.add(j+1);
//                 }
//                 sum =0;
                
//             }
//         }
//         int dsf[] = new int[ls.size()];              
//           for(int i =0;i<ls.size();i++){
//           dsf[i] = ls.get(i);
//            }
//         return dsf;
        
    }
}