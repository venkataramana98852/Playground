import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int r=0,res=1;
      while(r<exp)
      {
      res =res*base;
        r++;//Try your logic here
    }
      System.out.print(res);
}
}