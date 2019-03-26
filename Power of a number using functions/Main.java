import java.util.Scanner;
class Main{
  public static int value(int b,int e)
  {
    int pow=1;
    while(e!=0)
    {
    	pow=b*pow;
      e--;
    }
      return pow;
    }
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=in.nextInt();
      int  power=value(n,x);
      System.out.print(power);
	    // Type your code here
	}
}
