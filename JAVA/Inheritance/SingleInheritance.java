class Base
{

	int a = 10;

}

class Child extends Base{

	int b;

	void sum()
{

	b = 20;
		
        System.out.println("Sum of a and b is : " +(a + b));

	}

}

class SingleInheritance
{

public static void main(String[] args)
{

	Child obj = new Child();

	obj.sum();

}

}