import java.util.Scanner;//import required packages

class Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("Base Salary: "+basesalary);//write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("CSE Faculty: "+(basesalary+3000));//write your CSE class statements
  }
}
class IT extends CSE

{
  public void salary(int basesalary)
  {
    System.out.println("IT Faculty: "+(basesalary+5000));//write your IT class statements
  }
}
class ECE extends IT
{
  public void salary(int basesalary)
  {
   System.out.println("ECE Faculty: "+(basesalary+4500)); //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int basesalary=sc.nextInt();
    if(basesalary>0)
    {
      Faculty obj=new Faculty();
      obj.salary(basesalary);
      CSE obj1=new CSE();
      obj1.salary(basesalary);
      IT obj2=new IT();
      obj2.salary(basesalary);
      ECE obj3 = new ECE();
      obj3.salary(basesalary);
    }
    else
    {
      System.out.println("null");
    }
    //implement your required concept here
  }
}