import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      greatest_no(n1,n2,n3);
    }
      public static void greatest_no(int n1,int n2,int n3)
      {
        if(n1>n2 && n1>n3)
          System.out.print(n1);
      else if(n2>n3)
        System.out.print(n2);
      else
        System.out.print(n3);
	}
}