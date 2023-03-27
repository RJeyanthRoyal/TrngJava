class A1
{
public void FunA1(){
System.out.println("Fun A1 method of classA");
}
}

class A2
{
public void FunA2(){
System.out.println("Fun A2 method of classA");
}
}

class B1
{
public void FunB1(){
System.out.println("Fun B1 method of classB");
}
}

class B2
{
public void FunB2(){
System.out.println("Fun B2 method of classB");
}
}

class Program42
{
public static void main(String args[]){
A obA=new A();
obA.funA1();
obA.funA2();
B obB=new B();
obB.funB1();
obB.funB2();
}
}
