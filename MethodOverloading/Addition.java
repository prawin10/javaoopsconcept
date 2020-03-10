package MethodOverloading;

public class Addition {
int a=10;
int b=25;
void add()
{
	System.out.println(a+b);
}
void add(double num1,double num2)
{
	System.out.println(num1+num2);
}
void add(int n1,int n2,int n3)
{
	System.out.println(n1+n2+n3);
}
void add(String s1)
{
	System.out.println(s1);
}
public static void main(String args[])
{
	Addition obj =new Addition();
	obj.add();
	obj.add(2.5,7);
	obj.add(3,5,7);
	obj.add("hi praveen");
}

}
