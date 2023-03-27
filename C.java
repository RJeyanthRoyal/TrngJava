class A
{
public void FunA1(){
System.out.println("Fun A1 method of classA");
}
}


class B
{
public void FunA2(){
System.out.println("Fun A2 method of classB");
}
}

class C
{
public static void main(String args[])
{
A obA=new A();
obA.FunA1();
B obB=new B();
obB.FunA2();
}
}
