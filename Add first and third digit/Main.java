import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n%10;
      int last=n/100;
      int sum=first+last;
      System.out.println(sum);// Type your code here
	}
}