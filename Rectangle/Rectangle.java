import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
if(t>=1&&t<=1000)
{
int a,b,c,d;
for(int i=0;i<t;i++)
{
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  d=sc.nextInt();
  if(a>=1&&a<=10000&&b>=1&&b<=10000&&c>=1&&c<=10000&&d>=1&&d<=10000)
  if(a==b&&c==d||a==c&&b==d||a==d&&b==c||a==b&&b==c&&c==d&&d==a)
  {
   System.out.println("YES");
  }
  else
  {
    System.out.println("NO");
  }
}
}
}
}
