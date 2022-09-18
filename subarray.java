/*package whatever //do not write package name here */

import java.util.*;

public class subarray {
    

    //Count the subarray which has sum as n

    public static long find(long arr[],int n,int target)
    {
        long count=0;
        long prefix=0;
        HashMap<Long,Long>  map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
          prefix+=arr[i];
          if(prefix==target)
              count++;
          if(map.containsKey(prefix-target))
          {
            count+=map.get(prefix-target);
          }
          map.put(prefix,map.getOrDefault(prefix,0L)+1);
        }
        return count;
    }
    // Find the subarray which is divisible by n
    public static long solve(long arr[],int n)
    {
        long prefix[]=new long[n+1];
        prefix[0]=0;
        for(int i=0;i<n;i++)
        {
            long sum=(prefix[i]+arr[i])%n;
            prefix[i+1]=(sum+n)%n;
        }
        HashMap<Long,Long> map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(prefix[i],map.getOrDefault(prefix[i],0L)+1);
        }
        long ans=0;
        for(Map.Entry<Long,Long> entry: map.entrySet())
        {
            long x=entry.getValue();
            ans+=(x*(x-1))/2;
        }
        
        return ans;
        
    }


    //Nearest Smallest value

    public static long[] smallest(long arr[],int n)
    {
        Stack<Integer> st=new Stack<>();
        long previous[]=new long[n];
        previous[0]=0;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            previous[i]=st.isEmpty()?0: st.peek()+1;
            st.push(i);
        }
        return previous;

    }
	public static void main (String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
        //int target=input.nextInt();
	    long arr[]=new long[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=input.nextLong();
	    }
	    long x[]=smallest(arr, n);
        for(long i: x)
          {
            System.out.print(i+" ");
          }


		
	}
}