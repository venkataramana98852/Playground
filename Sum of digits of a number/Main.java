import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=0;
      while(n>0)
      {
        int r=n%10;
        a=a+r;
        n=n/10;
      // Type your code here
	}
      System.out.println(a);
}
}