import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last=n%10;
      int r,x=0;
      while(n>0)
      {
        r=n%10;
        x=x*10+r;
        n=n/10;
      }
	
      int first=x%10;
      int sum=first+last;
      System.out.println(sum);
  
	}
}