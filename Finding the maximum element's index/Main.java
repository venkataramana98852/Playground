import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int l=0;
    int j=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();                         
  }
    for(int i=0;i<n;i++)
    {
      if(arr[i]>l)
      {
       l=arr[i];
      j=i;
      }
    }
    System.out.print(j);
  }
        
}