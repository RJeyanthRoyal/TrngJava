import java.util.Scanner;
class Program28
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int num4=sc.nextInt();
int res=(num4*num3*(num1/num2));
System.out.print(num4+"*"+num3+"*"+(num1+"/"+num2)+"="+res);
}
}
