import java.util.*;
class student{
  static int tn = 0;
  int id;
  String name;
  student(){
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter name of the student: ");
    name = s.next();
    tn++;
    id = tn;
  }

  void info(){
    System.out.println("\nName of the student: "+name);
    System.out.println("Student ID: "+id);
    System.out.println("Strenght of Students: "+tn);
  }
}
class Student_management {
  public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of students to be added: ");
int n = s.nextInt();
student[] stu = new student[n];
for(int i=0;i<n;i++){
  stu[i] = new student();
}
for(int j=0;j<n;j++){
  stu[j].info();
}
  }
}
