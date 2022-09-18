import java.util.*;
public class cordis {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        double x=input.nextDouble();
        int count=2;
        double prev=0;
        double curr=0;
        double ans=1/Math.pow(x,1);
        prev=ans;

        while(true)
        {
        ans+=1/Math.pow(x,count);
        prev=curr;
        curr=1/Math.pow(x,count);
        count++;
        if(Math.abs(curr-prev)<0.00001)
        {
            break;
        }
        }
        System.out.printf("%.4f",ans);
}
    
}
