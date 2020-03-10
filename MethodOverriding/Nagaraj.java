package MethodOverriding;

public class Nagaraj {
void watching() {
	System.out.println("Nagaraj is playing fotball");
}
}
 class Prawin extends Nagaraj {
void play() {
	System.out.println("Prawin is playing football");
}
public static void main(String args[]) {
Prawin football=new Prawin();
	football.watching();
	((Prawin)football).play();
	}
}
