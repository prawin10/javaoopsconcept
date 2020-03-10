package Abstraction;

abstract class Animal {
  
   abstract void animalsound();{
	   System.out.println("sleep");
   }
 
  
}


 class Pig extends Animal {
   void animalsound() {
    
    System.out.println(" wee wee");
  }

 }
   class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); 
    myPig.animalsound();
    
  }}
  
  
