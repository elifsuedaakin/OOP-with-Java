public class Main {
  public static void main(String args[]){  
      Student student1=new Student("Ayşe",101);
      student1.addGrade(49);
      student1.addGrade(30);
      Student student2= new Student("Elif",102);
      student2.addGrade(70);
      student2.addGrade(100);
      
      School school=new School();
      school.addStudent(student1);
      school.addStudent(student2);
      school.printAllAvareges();
  }
  
}
