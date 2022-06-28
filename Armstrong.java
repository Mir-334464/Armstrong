import java.util.*;

class Armstrong

{

  public static void main(String[]args)

       {

     Scanner sc =new Scanner(System.in);

     System.out.print("Enter Three Digit Number: ");

    int N=sc.nextInt();

     int Sum=0, i=N;

while(i!=0)
{

 int rem=i%10;
 
 Sum=Sum+(rem*rem*rem);
 
 i=i/10;
}
if(N==Sum)
System.out.println("Enter Number is an Armstrong Number");
else
System.out.println("Enter Number is not an Armstrong Number");
    }

}

