package MethodOverloading;

public class Division {
int x=86;
int y=3;
void div() {
	System.out.println(x/y);
}
void iv(int num1,int num2) {
	System.out.println(num1/num2);
}
void div(double d) {
	System.out.println(d/d/d);
}
void div(String string) {
	System.out.println(string);
}
public static void main(String args[]) {
	Division obj=new Division();
	obj.div();
	obj.div(45.2/3);
	obj.div(3);
	obj.div("i feel football fever");
	
}

}
