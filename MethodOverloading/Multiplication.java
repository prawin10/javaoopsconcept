package MethodOverloading;

public class Multiplication {
int a=20;
int b=15;
void multi1() {
	System.out.println(a*b);
}
void multi(int num1,int num2) {
	System.out.println(num1*num2);
}
void multi(int n1,int n2,int n3) {
	System.out.println(n1*n2*n3);
}
void multi (String s1){
	System.out.println(s1);
}
public static void main(String args[])
{
	Multiplication obj=new Multiplication();
	obj.multi1();
	obj.multi(25,5);
	obj.multi(22,10,3);
	obj.multi("Hai Prawin");
}


}
