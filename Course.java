package test;


public class Course {
private String Cname;
private int Cid;
private Teacher teacher;
private String Place;
private String Time;
private Student[] students;

public Course(int Cid,String Cname,String Place,String Time,Teacher teacher) {
	  super();
	  this.Cid=Cid;
	  this.Cname=Cname;
	  this.Place=Place;
	  this.Time=Time;
	  
	  this.setTeacher(teacher);
	  students = new Student[30];
	 }



	 public Course() {
	  super();
	  students = new Student[30];
	 }
	 
	 //�޸Ļ��ȡ����ֵid��name��place,time��
	 public void setId(int id){
	  this.Cid=id;
	 }
	 public int getId(){
	  return this.Cid;
	 }
	 public void setName(String name){
	  this.Cname=name;
	 }
	 public String getName(){
	  return this.Cname;
	 }
	 public void setPlace(String place){
		  this.Place=place;
		 }
		 public String getPlace(){
		  return this.Place;
		 }
		 public void setTime(String time){
			  this.Time=time;
			 }
			 public String getTime(){
			  return this.Time;
			 }
			
	
	 public Teacher getTeacher() {
	  return teacher;
	 }
	 public void setTeacher(Teacher teacher) {
	  this.teacher = teacher;
	 }
	 
	 //�μ���ѧ��
	 public boolean addStudent(Student stu){
	  boolean flag = false;//��־ֵ���Ƿ����ɹ�
	  //���ѧ��û��ѡ�����ſΣ�ͬʱ�ε�ѧ����û����ִ��
	  if(!isSelectedStudent(stu)&&isNullStudent(stu)){
	   for(int i=0;i<students.length;i++){
	    if(students[i]==null){
	     students[i]=stu;
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }
	 //���Ƴ�ѧ��
	 public boolean removeStudent(Student stu){
	  boolean flag=false;
	  if(isSelectedStudent(stu)){//ѡ�����ſ�
	   for(int i=0;i<students.length;i++){
	    if(students[i]==stu){
	     students[i]=null;
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }
	 //��ʾѡ��γ̵�ѧ����
	 public void displayStudent(){
	  System.out.println("ѡ��Ŀγ̣�"+this.Cname+"��ѧ����:");
	  for(Student s:students){
	   if(s!=null){
	    System.out.print(s.getStuName()+" ");
	   }
	  }
	  System.out.println();
	 }
	 //�ӷ���1��ѧ���Ƿ�ѡ�����ſ�
	 public boolean isSelectedStudent(Student stu){
	  boolean flag=false;
	  for(Student s:students){//ֻ�����ڼ�飬�����޸�
	   if(s==stu){
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
	 //�ӷ���2��ѧ��ѧ��δ�ﵽ�޶�������
	 public boolean isNullStudent(Student stu){
	  boolean flag=false;
	  for(Student s:students){
	   if(s==null){//���п�λ
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	 
	 }
}
