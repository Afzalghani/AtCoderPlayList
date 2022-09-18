import java.util.*;

public class check {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int t=input.nextInt();
    while(t>0){
        int count=0;
        boolean find=false;
        int n=input.nextInt();
        int arr[][]=new int[n][5];

        for(int i=0;i<n;i++)
        {
            int x=input.nextInt();
            for(int j=0;j<x;j++)
            {
                arr[i][j]=input.nextInt();
                //System.out.println(arr[i][j]);
            }
            //System.out.println();
            

        }
    
    
   
    for(int i=0;i<n;i++)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int j=0;j<arr[i].length;j++)
        {
            if(arr[i][j]!=0)
               set.add(arr[i][j]);
        }
        int c=0;
        for(int l=i+1;l<n;l++)
        {
            for(int y=0;y<5;y++)
            {
                if(arr[l][y]!=0)
                set.add(arr[l][y]);
            }
            if(set.size()>=5)
               {
              find=true;
               }

               for(int y=0;y<5;y++)
               {
                   if(arr[l][y]!=0)
                   set.remove(arr[l][y]);
               }
        }
            
 }
    if(find)
      System.out.println("YES");
    else
       System.out.println("NO");
        t--;
    }
   
    
   }    
}
