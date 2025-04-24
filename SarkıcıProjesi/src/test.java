
import java.util.Scanner;

public class test {
    private static Sarkicilar sarkicilar=new Sarkicilar(); 
    private static Scanner scanner=new Scanner(System.in);
    public static void islemleri_bastir(){
       
         System.out.println("\t 0-işlemleri görüntüle");
         System.out.println("\t 1-şarkıcıları görüntüle");
         System.out.println("\t 2-şarkıcı ekle ");
         System.out.println("\t 3-şarkıcı güncelle ");
         System.out.println("\t 4-şarkıcı sil");
         System.out.println("\t 5-şarkıcı ara");
         System.out.println("\t 6-uygulamadan çıkış");
    }
    public static void main(String [] args){
        System.out.println("\t şarkıcı uygulamasına hoşgeldiniz");
        islemleri_bastir();
        boolean cikis=false;
        int islem;
        while(!cikis){
            System.out.println("işlem seçiniz:");
            islem=scanner.nextInt();
            
            scanner.nextLine();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                case 3:
                    guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("uygylamadan çıkılıyor...");
                    break;
            }
        }
    }
    public static void goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    
      public static void sarkici_ekle(){
          System.out.println("eklemek istediğiniz sarkıcının ismi");
          String isim=scanner.nextLine();
          sarkicilar.sarkici_ekle(isim);
    }
        public static void guncelle(){
            System.out.println("hangi pozisyondaki şarkıcıyı güncelleyeceksiniz?");
            int pozisyon=scanner.nextInt();
            scanner.nextLine();
            String yeni_isim=scanner.nextLine();
            sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
    }
          public static void sil(){
              System.out.println("silmek istediğiniz pozisyon");
              int pozisyon=scanner.nextInt();
             sarkicilar.sarkici_sil(pozisyon);
    }
           public static void ara(){
              System.out.println("aramak istediğiniz şarkıcı");
               String isim=scanner.nextLine();
               sarkicilar.sarkici_ara(isim);
    }
}
