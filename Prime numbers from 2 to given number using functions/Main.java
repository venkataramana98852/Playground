import java.util.Scanner;
class Main{
  public static void value(int n)
  {
    int x=2,a=1,r,fc=0;
   while(x<=n)
   {
     while(a<=x)
    {
    r=x%a;
    if(r==0)
    fc=fc+1;
    a++;
    }
    if (fc==2)
    System.out.println(x);
    x++;
    a=1;
     fc=0;
  }
   
  }
    public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      value(n);
	  
   // Type your code here
	}
}