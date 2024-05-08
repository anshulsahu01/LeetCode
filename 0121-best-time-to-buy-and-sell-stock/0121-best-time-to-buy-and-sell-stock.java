class Solution {
    public int maxProfit(int[] p) {
        // int max=0;
//         int min=p[0];
//         int sum=0;
//         for(int i=0;i<p.length;i++){
//             // for(int j=i+1;j<p.length;j++){
//             min=Math.min(min,p[i]);
//             max=Math.max(max,p[i]);
            
//             // sum=max-min;
            
//                 // int sum=p[j]-p[i];
//                 // max=Math.max(sum,max);
                
//             // }
//         }
//         sum=max-min;
//         return sum;
        
        
        //2nd try
        
//         int MP=0;
//         int min=p[0];
        
//         for(int i=1;i<p.length;i++){
//             int sum=p[i]-min;
//             MP=Math.max(sum,MP);
//         }
        
//     }
//     return sum;
        
        
        //3rd try
        
        int min=p[0];
        int mp=0;
        for(int i=0;i<p.length;i++){
            int cost=p[i]-min;
            mp=Math.max(mp,cost);
            min=Math.min(min,p[i]);
            //ye max min ka fanda ye hai ki in mai value dalo or pata karo konsa max hai konsa min hai
        }
        return mp;
       
    }    
}