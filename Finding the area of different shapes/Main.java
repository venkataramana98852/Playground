import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int optin=in.nextInt();
      switch(optin)
      {
        case 1:
          int side=in.nextInt();
          int area1=side*side;
          System.out.println(area1);
          break;
        case 2:
          int length=in.nextInt();
          int breadth=in.nextInt();
          int area2=length*breadth;
          System.out.print(area2);
          break;
        case 3:
          double base=in.nextDouble();
          double height=in.nextDouble();
          double area3=(base*height)/2;
          System.out.println(area3);
          break;
        case 4:
          double r=in.nextDouble();
          double area4=3.14*r*r;
          System.out.println(area4);
          break;
      }//Try your code here
    }
}