import java.util.*;
public class CoinCombination {

    public static long find(int arr[],int target,int n)
    {
        int mod=1000000007;
        if(n<1)
          return 0;
          
       long dp[]=new long[target+1];

       dp[0]=1;
       for(int i=1;i<=target;i++)
       {
        for(int j: arr)
        {
            if(i>=j)
            {
                dp[i]=(dp[i]%mod + dp[i-j]%mod)%mod;
                
                //System.out.println("Iam enter");
            }
        }
       }
       return dp[target];
      
       
    
    
}
   public static void main(String args[])
   {
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int target=input.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
        arr[i]=input.nextInt();
     }
     System.out.println(find(arr,target,n));


   }
    
}