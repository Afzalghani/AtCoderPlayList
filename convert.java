import java.util.*;
public class convert {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        // Taking the input from the user
		System.out.print("Enter the number in feet: ");
		long feet=input.nextLong();

        //If the enter feet is zero or less than zero then print out of range
		if(feet<=0)
		{
		    System.out.println("Number out of range ");
		}
		else{
            //Check if it is less than 5280 then print as it is 
		    if(feet<5280)
		    {
		        System.out.println("You entered  "+feet+" feet");
		    }
            // if it is divisible by 5280 then find it in miles
		    else if(feet%5280 ==0)
		    {
		        System.out.println("You entered "+feet/5280+ " miles");
		    }
            // If after divison we have some value which can be converted in feet
		    else{
		        System.out.println("You entered "+feet/5280+" miles "+ feet%5280+" "+"feet");
		    }
		}
    }
    
}
