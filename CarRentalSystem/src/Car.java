
public class Car {
  private String model;
  private String plateNumber;
  private boolean isRented;
  
  public Car(String model,String plateNumber){
      this.model=model;
      this.plateNumber=plateNumber;
      this.isRented=false; //başlangıçta araç kıralanmamıs
  }
  /*Eğer isRented parametresi koyuyorsan, onun değerini ataman gerekir, yoksa parametre anlamsız olur.
Bizim örnekte, araç her zaman başlangıçta kiralanmamış olduğu için parametre koymadık.*/
  public String getModel(){
      return model;
  }
  public String getPlateNumber(){
      return plateNumber;
  }
  public boolean isRented(){
      return this.isRented;
  } 
  public void rent(){// araç kiralandığında çağrılır
      isRented=true;
  }
  public void returnCar(){ //araç iade edildiğinde çağrılır
      isRented=false;
  }
}
