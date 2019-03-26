import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n%10;
      int second=n/10;
      int sum=first+second;
     
      System.out.println(sum);// Type your code here
	}
}