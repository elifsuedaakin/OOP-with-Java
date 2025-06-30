import java.util.ArrayList;
public class School {
    private ArrayList<Student> students = new ArrayList<>(); //students: Öğrencileri saklayan bir liste (ArrayList).
    //Student daha önce olusturdugun sınıf
    
    public void addStudent(Student student){
        students.add(student);
    }
   public void printAllAvareges(){ 
   for(Student s : students){//Her turda, listedeki bir Student nesnesini alır ve s değişkenine koyar. bu sekılde students lıstesının ıcını gezmıs olur
   double avg=s.calculateAvarege();
   String status=s.isPassed() ? "passed": "Falled";//Öğrenci geçti mi, kaldı mı onu belirler. true ıse passed,değilse failed
   System.out.println("name:"+s.getName()+"|ID:"+s.getId()+" | Avarege :"+avg+ "|status"+status);
   }
}
//Öğrencinin adı, numarası, ortalaması ve durumu ekrana yazdırılır.
//Bu şekilde tüm öğrencilerin durumu görülebilir.


   
}