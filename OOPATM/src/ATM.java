import java.util.Scanner;
public class ATM {
    public void calis(hesap hesap){ //hesap classından hesap objesi göndermek istiyoruz
     login login=new login();
     Scanner scanner=new Scanner(System.in);
        System.out.println("bankamıza hoş geldiniz");
        System.out.println("*******************");
        System.out.println("kullanıcı girişi");
        System.out.println("*******************");
        
        int giris_hakkı=3;
        while(true){
            if(login.login(hesap)){
                System.out.println("giriş başarılı");   
                break;
        }
            else{ System.out.println("giriş başarısız");
            giris_hakkı-=1;
                System.out.println("kalan giriş hakkı"+giris_hakkı);
            }
            if(giris_hakkı==0){
                System.out.println("giriş hakkınız bitti");
                return;
            }
            
    } 
        System.out.println("****************************");
        String islemler="1.bakiye_goruntule\n"
                +"2.para yatırma\n"
                +"3.para çekme\n"
                +"çıkış için q ya basın\n";
        System.out.println("işlemler"+islemler);
        System.out.println("*********************");
        
        while(true){
            System.out.println("işlemi seçiniz");
            String islem=scanner.nextLine();
                
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("bakiyeniz"+hesap.getBakiye());
                
            }
            else if(islem.equals(2)){
                System.out.println("yatırmak istediğiniz tutar");
              int tutar=scanner.nextInt();
              scanner.nextLine();
              hesap.ParaYatır(tutar);
            }
            else if(islem.equals(3)){
                System.out.println("çekmek istediğiniz tutar");
                int tutar =scanner.nextInt();
                scanner.nextLine();
                hesap.ParaCek(tutar);
            }
            else{
                System.out.println("geçersiz işlem");
            }
        }
                
                
}}
