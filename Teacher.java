package test;


public class Teacher {
	private int id;

	private String sex;
	private String Tname;
	 private Course[] courses;
	 //���캯��
	 public Teacher() {
	  super();
	  courses= new Course[3];
	 }
	 public Teacher(int id,String Tname,String sex){
	  this.id=id;
	  this.Tname=Tname;
	  this.sex=sex;
	  courses = new Course[3];
	 }
	 public String toString(){
		 return this.id+" "+this.getTname()+" "+this.getSex()+" ";
		
	 }
	 //�޸Ļ����������
	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public String getTname() {
	  return Tname;
	 }
	 public void setTname(String Tname) {
	  this.Tname = Tname;
	 }
	 public String getSex() {
		  return sex;
		 }
		 public void setSex(String sex) {
		  this.sex=sex;
		 }
	 
}
