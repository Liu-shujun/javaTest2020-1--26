package test;

public class test {
	 public static void main(String[] args) {
		 Teacher t1=new Teacher(771,"Lili","Ů");
		 Teacher t2=new Teacher(775,"Jack","��");
		 Teacher t3=new Teacher(776,"Linda","Ů");
	
		  Student stu0 = new Student(1001,"����");
		  Student stu1 = new Student(1002,"����");
		  Student stu2 = new Student(1003,"С��");
		  Student stu3 = new Student(1004,"С��");
		  Course cour0 = new Course(001,"����","����102","�ܶ�",t1);
		  Course cour1 = new Course(002,"�ߴ�","����112","����",t2);
		  Course cour2 = new Course(003,"������","����111","����",t3);
		  stu0.addCourse(cour0);
		  stu0.addCourse(cour2);
		  stu0.addCourse(cour1);
		  stu1.addCourse(cour2);
		  stu1.addCourse(cour0);
		  stu2.addCourse(cour1);
		  stu3.addCourse(cour0);
		  stu3.addCourse(cour1);
		  stu1.removeCourse(cour2);
		  stu0.displayCourse();
		  cour0.removeStudent(stu1);
		  cour1.displayStudent();
		 }
		 
}
