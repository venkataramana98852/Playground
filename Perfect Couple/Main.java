import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      
      
       int temp=0;
      for(int i=0;i<n;i++)
      {
       temp=arr[i];
        for(int j=i+1;j<n;j++)
        {
          int sum=arr[i]+arr[j];
        
        if(sum==value)
        {
          System.out.println(arr[i]+","+" "+arr[j]);
        }
        }
      }
    }
  
}