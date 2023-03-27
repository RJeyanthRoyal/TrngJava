import java.util.Scanner;
class Program17
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();//15
if(num%7==0){System.out.print("EVEN");}
if(num%7==0){System.out.print("Monday,Wednesday,Friday");}
if(num%7!=0){System.out.print("ODD(1,3,5,7)");}
if(num%7!=0){System.out.print("Sunday,Tuesday,Thursday,Saturday");}
}//main()
}//Program17