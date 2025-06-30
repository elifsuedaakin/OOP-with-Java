import java.util.ArrayList;
public class Student {
    private String name;
    private int Id;
    private ArrayList <Integer>grades= new ArrayList<>();
    public Student(String name,int Id){
        this.Id=Id;
        this.name=name;
        // this.grades = new ArrayList<>(); burdada başlatabılırdık 
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double calculateAvarege(){
        if(grades.isEmpty()) //eğer grades listesi boşsa(öğrencinin hiç notu yoksa)
            return 0.0; //ortalama hesaplanmaz o yuzden 0.0 dondurulur.
        int total=0; //notların toplamını tutmak ıcın bır degısken tanımlanır ve baslangucta sıfır yapılır 
        for(int g: grades){ //for each dongusu ,grades listesindeki her notu tek tek alır (burada her not g)
            total+=g; // her not total degıskenıne eklenır 
        } 
        return (double) total /grades.size(); // toplam not , not sayısına bölünür 
    }
    public boolean isPassed(){
        return calculateAvarege() >= 50.0;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }
}
