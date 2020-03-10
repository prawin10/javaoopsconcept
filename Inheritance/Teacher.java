package Inheritance;

public class Teacher {
	
		   String designation = "Teacher";
		   String collegeName = "JEPPIAAR";
		   void does(){
			System.out.println("Teaching");
		   }
	

		public static class PhysicsTeacher extends Teacher{
		   String mainSubject = "Physics";
		   public static void main(String args[]){
			   PhysicsTeacher obj = new PhysicsTeacher();
			   System.out.println(obj.collegeName);
				System.out.println(obj.designation);
				System.out.println(obj.mainSubject);
			obj.does();
			
			
		   }
		}
}
