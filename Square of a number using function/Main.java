import java.util.Scanner;
class Main
{
  public static int sqare_of_no(int m)
  {
    int square=m*m;
  return square;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sqare_of_no(n);
      System.out.print(sum);// Type your code here   
	} 
}