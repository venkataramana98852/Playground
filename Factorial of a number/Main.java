import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
      	int n=in.nextInt();
      	int f;
      for(f=1;n>0;n--)
      {
        f=f*n;
      }
    	System.out.println(f);
	}
}