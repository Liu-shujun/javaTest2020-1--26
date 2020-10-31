# javaTest2020-10-26
姓名：刘淑君 班级：计G202  学号：2020322093
## 实验目的
1.了解系统分析需求，懂得如何去定义类中的属性和方法；

2.掌握面向对象类的设计方法；

3.掌握子类父类的的继承用法，通过构造方法实例化对象；

4.学会使用super()，用super操作被隐藏的成员变量和方法，用于实例化子类；

5.掌握使用object根类的toString()，应用在相关对象的信息输出中；

## 实验要求
1.学生选课模拟系统要有学生和教师两位成员。教师教授课程（只能教授一门），学生选择课程（只能选择一门），课程只能由一位老师教授；

2.属性

（1）Teacher类：编号：id；姓名：Tname；性别：sex；所授课程：course；

（2）Student类：学号:stuId；姓名:stuName；性别:stuSex；专业:major；所选课程:course；

（3）Course类 ：编号：Cid；名字：Cname；上课地点：place；上课时间：time；授课老师：teacher；选课学生：student；

（4）test类   ：定义了三位老师；四位同学；三门课程；

3.编写实体类以及测试主类；在主类中实例化多个类实体，模拟学生选课以及退课操作，打印课程信息。
## 实验过程

1.编写了三个实体类，分别设定了每个类中的属性，通过addCourse()方法和removeCourse()方法在Student类中实现学生的选课和退课的操作，；

2.通过toString()方法，返回一个“以文本方式表示”对象的字符串；

3.编写测试主类，分别设置了三位老师，四位学生，以及三门课程；
## 流程图
![](https://github.com/Liu-shujun/javaTest2020-10-26/blob/main/%E6%8D%95%E8%8E%B7.PNG) 
## 核心代码
```
//课加入学生
	 public boolean addStudent(Student stu){
	  boolean flag = false;
	  //如果学生没有选过这门课，同时课的学生还没满则执行
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
```

