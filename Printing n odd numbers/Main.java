import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=1,temp=1;
      while(temp<=n)
      {
        if(count%2==1)
        {
          System.out.println(count);
        temp=temp+1;
        }
        count=count+1;
        
        // Type your code here
	}
    }
}