class Base{
int n=5;
}
class Child extends Base{
int n=10;
void show(){
System.out.println(+n);
System.out.println(+super.n);
}
}
class Super{
public static void main(String[] args){
Child obj = new Child();
obj.show();
}
}