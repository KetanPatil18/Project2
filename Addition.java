public class Addition
{
 int a;
 int b;

 public Addition(int a,int b)
 {
  this.a=a;
  this.b=b;
 }

 public int add()
 {
  return a+b;
 }

 public static void main(String[] args)
 {
  Addition add=new Addition(478,522);
  add.add();
 }
}