class GrandParent{
int n=5;
}
class Parent extends GrandParent{
int m=10;
void sum(){
System.out.println("Sum of m+n is:"+ m+n);
}
}
class Child extends Parent{
int a=7;
void mul(){
System.out.println("mul of m*n*a is:" + m*n*a);
}
}
class MultiLevel{
public static void main(String args[]){
Child c = new Child();
c.mul();
}
}