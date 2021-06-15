interface OuterInterface{
void outerMethod();
interface InnerInterface{
void innerMethod();
}
}
class A implements OuterInterface{
public void outerMethod(){
System.out.println("This is Outer Interface Method");
}
}
class B implements OuterInterface.InnerInterface{
public void innerMethod(){
System.out.println("This is inner Interface Method");
}
}
public class NestedInterface{
public static void main(String args[]){
A a = new A();
B b = new B();
a.outerMethod();
b.innerMethod();
}
}