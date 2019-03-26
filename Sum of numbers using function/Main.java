import java.util.Scanner;
class Main
{
  public static int sqare_of_no(int m)
  {
    int sum=0,a=1;
    while(a<=m)
    {
       sum=sum+a;
    a++;
    }
    return sum;
    
  
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=sqare_of_no(n);
      System.out.print(s);// Type your code here   
	} 
}