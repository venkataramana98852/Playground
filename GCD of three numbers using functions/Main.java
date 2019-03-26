import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      gcd(n1,n2,n3);
    }
      public static void gcd(int n1,int n2,int n3)
      {
        int i,gcd=0;
        for(i=1;i<=n1 && i<=n2 && i<=n3;i++)
        {
          if((n1%i==0) && (n2%i==0) && (n3%i==0))
            gcd=i;
        }
        System.out.print(gcd);
      }
  
}