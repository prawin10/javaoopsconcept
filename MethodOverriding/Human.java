package MethodOverriding;

 
	 class Human {
	public void act()
	{
		System.out.println("Human is acting");
	}
	
	}
	 class Boy extends Human{
	public void act()
	 {
		 System.out.println("Boy is acting");
	 }
	 public static void main(String[] args)
	 {
Boy obj=new Boy();
		 obj.act();
		 
	 }
 }
