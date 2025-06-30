
public class main {
    public static void main (String[] args){
        CarRental rental=new CarRental();
        //araç oluşturuyoruz
        Car car1= new Car("Mercedes benz","07-elif-100");
        Car car2= new Car("Honda civic","1234567");
        
        //araçları sısteme eklıyoruz
        rental.addCar(car1);
        rental.addCar(car2);
        
        //araçları kiralıyoruz 
        rental.rentCar("3456789");
        rental.returnCar("34Abcd4");
        rental.rentCar("07ELF100");
        
        //Araç listesini ve duruları gosterıyoruz 
        rental.listCars();
    }
}
