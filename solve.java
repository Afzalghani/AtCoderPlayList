import java.util.*;
public class solve {
    public int digit(int n)
    {
        if(n==0)
          return 0;
        String s=Integer.toString(n);
        int max=0;
        for(char x: s.toCharArray())
        {
            max=Math.max(max,x-'0');
        }
        n-=max;
        return 1+digit(n);

    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        solve s=new solve();
        System.out.println(s.digit(n));
        
    }
    
}
