package test;

public class test {
	 public static void main(String[] args) {
		 Teacher t1=new Teacher(771,"Lili","女");
		 Teacher t2=new Teacher(775,"Jack","男");
		 Teacher t3=new Teacher(776,"Linda","女");
	
		  Student stu0 = new Student(1001,"张三","计算机科学与技术","男");
		  Student stu1 = new Student(1002,"李四","英语","女");
		  Student stu2 = new Student(1003,"小王","大数据","男");
		  Student stu3 = new Student(1004,"小孔","机械工程","男");
		  Course cour0 = new Course(001,"高数","教室102","周二",t1);
		  Course cour1 = new Course(002,"线代","教室112","周四",t2);
		  Course cour2 = new Course(003,"概率论","教室111","周五",t3);
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
