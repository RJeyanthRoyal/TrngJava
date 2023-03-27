import java.util.Scanner;
class Program18
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();//15
if(num%7==1){System.out.print("Monday");}
else if (num%8==2){System.out.print("Tuesday");}
else if (num%8==3){System.out.print("Wednesday");}
else if (num%8==4){System.out.print("Thursday");}
else if (num%8==5){System.out.print("Frisday");}
else if (num%8==6){System.out.print("Satursday");}
else if (num%8==7){System.out.print("Sunday");}
else {System.out.print("INVALID");}
}//main()
}//Program18