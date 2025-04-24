
import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        String islemler="işlemler...\n"
                +"1.kare alan hesapla"
                +"2. üçgen alan hesapla"
                +"3. Daire alan hesapla"
                +"çıkış için q ya basın";
        while(true){
            System.out.println(islemler);
            System.out.println("hangi şeklin alanını almak istiyorsunuz");
            String sekil_turu=scanner.nextLine();
            Sekil sekil=null;
            if(sekil_turu.equals("q")){
                System.out.println("çıkış yapılıyor");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.println("karenin kenarı");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                
                sekil= new Kare(kenar,"kare1");
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("2")){
                System.out.println("kenar1:");
                int kenar1=scanner.nextInt();
                 System.out.println("kenar2:");
                int kenar2=scanner.nextInt();
                 System.out.println("kenar3:");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                sekil =new Ucgen("ucgen1",kenar1,kenar2,kenar3);
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("3")){
                System.out.println("dairenin yarıçapı");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire(yaricap,"Daire1");
                sekil.alanHesapla();
                
            }
            else {
                System.out.println("geçersiz işlem");
            }
        }
    }
}
