import java.util.*;
public class permutation {
    public static void main(String[] args) {   
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n==1)
          System.out.println(1);
        else if(n<=3)
          System.out.println("NO SOLUTION");
        else if(n%2==1){
            int index1=1;
            int index2=2;
            while(index1<=n)
            {
                System.out.print(index1+" ");
                index1+=2;
            }
            while(index2<=n)
            {
                System.out.print(index2+" ");
                index2+=2;
            }

        }
        else if(n%2==0)
        {
            int index1=n;
            int index2=n-1;
            while(index2>0)
            {
                System.out.print(index2+" ");
                index2-=2;
            }
            while(index1>0)
            {
                System.out.print(index1+" ");
                index1-=2;
            }
        }
        
    }
    
}
