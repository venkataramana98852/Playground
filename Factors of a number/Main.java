import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1;
      for(i=1;i<=n;i++)
      {
        int r=n%i;
        if(r==0)
          System.out.println(i);
      }// Type your code here
	}
}