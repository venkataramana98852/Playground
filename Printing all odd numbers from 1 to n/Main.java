import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int count=1;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
      while(count<=n) 
      {
        if(count%2==1) 
        {
          System.out.println(count);
        }
          count=count+1;
       
      }// Type your code here
    }
}