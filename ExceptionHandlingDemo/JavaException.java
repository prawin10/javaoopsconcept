package ExceptionHandlingDemo;

public class JavaException {
public static void main(String args[]) {
int a=15;
int b=0;
try {
	System.out.println(a/b);
}
catch(ArithmeticException ae)
{
	System.out.println("please correct answer");
}
catch(Exception e)
{
	System.out.println("i am just super class exception");
}
finally {
	System.out.println("hi i am football player");
}
}
}
