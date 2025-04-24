import java.util.Scanner;

public class login {
   public boolean login(hesap hesap){ //class ismi + referans yazıyoruz obje gönderiyoruz çünkü
       Scanner scanner=new Scanner(System.in);
       String kullanici_adi;
       String parola;
       
 //kullanıcıdan kullanıcı adı ve parola istiyotuz ve bu değerlerin hesaptaki değere eşit olmasını istiyoruz
 
          System.out.println("Kullanıcı Adı");
          kullanici_adi=scanner.nextLine();
            System.out.println("parola");
            parola=scanner.nextLine();
            
//hesabımızın kullanıcı adını almak istiyoruz
 if(hesap.getKullanıcı_adı().equals(kullanici_adi) && hesap.getParola().equals(parola)){
    return true;
} 
 else{ 
     return false;
 }
   } 
    
}
