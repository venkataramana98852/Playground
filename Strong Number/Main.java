import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      	int n=in.nextInt();
      	int x=n;
      	int r,f,s=0;
      	while(n>0)
        {
          r=n%10;
          for(f=1;r>0;r--)
          {
            f=f*r;
          }
          s=s+f;
          n=n/10;
        }
     if(x==s)
      System.out.println("Yes");
      else
        System.out.println("No");
      
            
          // Type your code here
	}
}