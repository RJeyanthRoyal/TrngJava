import java.util.Scanner;
class B
{
public int findSmallest(int a,int b,int c)
{
int min=1;
if(a<b&&a<c)min=a;
if(b<a&&b<c)min=b;
if(c<a&&c<b)min=c;
return min;
}
}
 class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
B ob=new B();
int res;
System.out.println(ob.findSmallest(n1,n2,n3));
}
}


