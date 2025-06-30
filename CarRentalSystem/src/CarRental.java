import java.util.ArrayList;
public class CarRental {
   private ArrayList<Car> cars=new ArrayList<>();
   
   //araç ekleme metodu
   public void addCar(Car car){
       cars.add(car);
       System.out.println(car.getModel()+"model arac sisteme eklendı");
   }
   //Arac kiralama metodu (plaka numarasına göre)
   public void rentCar(String plateNumber){
       for(Car car : cars){
           if(car.getPlateNumber().equals(plateNumber) && !car.isRented()){
               car.rent();
               System.out.println(plateNumber+"plakalı araç kiralandı");
               return;
           }
       }
       System.out.println("Araç bulunamadı ya da zaten Kiralanmış ");
   }
       // Araç iade metodu (plaka numarasına göre)
    public void returnCar(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber) && car.isRented()) {
                car.returnCar();
                System.out.println(plateNumber + " plakalı araç iade edildi.");
                return;
            }
        }
        System.out.println("İade edilecek araç bulunamadı.");
    }
   
   
   //sistemdeki araçları ve durumları listeleme
   public void listCars(){
       System.out.println("Araç listesi");
       for(Car car: cars){
       String status =car.isRented() ? "KİRALANMIŞ" : "MÜSAİT";
       System.out.println(car.getModel()+"-"+car.getPlateNumber()+"|Durum : "+status);
       }
   }
}
/*Ternary Operatörün Genel Yapısı:
(condition) ? valueIfTrue : valueIfFalse;
condition doğruysa (true), valueIfTrue döner.

condition yanlışsa (false), valueIfFalse döner.*/