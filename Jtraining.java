class Jtraining
{
public void firstbreak()
{
System.out.println("First break time 11:10-11:20");
System.out.println("Take water");
}

public void secondbreak(){
System.out.println("Second break timing 01:00-01:50");
System.out.println("Have lunch");
}

public void thirdbreak(){
System.out.println("Third break timing 03:30-03:40");
System.out.println("Take water");
}
}

class Program40
{
public static void main(String args[])
{
Jtraining ob1=new Jtraining();
Jtraining ob2=new Jtraining();
Jtraining ob3=new Jtraining();

ob1.firstbreak();
ob2.secondbreak();
ob3.thirdbreak();
}
}

