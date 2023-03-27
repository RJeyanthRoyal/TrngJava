import java.util.Scanner;
class Program10
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();//15
int inc=scob.nextInt();//3
int i; //Variable declaration 
i=0;
while (i<=num1)
{
System.out.print(i+",");
i=i+inc;
}
}

}
