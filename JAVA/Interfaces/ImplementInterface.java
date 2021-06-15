interface Int{
void show();
void display();
}
class Intclass implements Int{
public void show(){
System.out.println("Show method in interface");
}
public void display(){
System.out.println("Display method in interface");
}
}
class ImplementInterface{
public static void main(String args[]){
Intclass i = new Intclass();
i.show();
i.display();
}
}