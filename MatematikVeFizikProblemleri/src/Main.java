
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("matematik ve fizik problemleri programına hoş geldiniz");
        String islemler="işlemler...\n"
                +"1. daire alanı hesaplama\n"
                +"2. üçgen çevresi hesaplama\n"
                +"3. iki vektörün iç çarpımını hesaplama\n"
                +"çıkış için q ya basın ";
        while(true){
            System.out.println(islemler);
            System.out.println("işlemi seçiniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programdan çıklıyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("dairenin yarıcapı:");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daire_alan(yaricap);
            } 
            else if(islem.equals("2")){
                System.out.println("kenar1:");
                int kenar1=scanner.nextInt();
                System.out.println("kenar2:");
                int kenar2=scanner.nextInt();
                 System.out.println("kenar3:");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                //problem içindeki static bir classın static bir metotu kullanacagız
                Problem.Matematik.ucgen_cevrei(kenar1, kenar2, kenar3);
            } 
            else if(islem.equals("3")){
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");
                
                Problem.Fizik.ic_carpim(vec1, vec2);
            }
            else{
                System.out.println("geçersiz işlem");
            }
        }
    }
}
