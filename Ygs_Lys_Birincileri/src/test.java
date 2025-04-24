import java.util.Scanner;
public class test {
    public static void main(String[]args){
        System.out.println("LYS LGS BİRİNCİ BULMA");
        Scanner scanner= new Scanner(System.in);
        String islemler="işlemler \n "+
                "1. eşit ağırlık öğrencileri birincisi\n"+
                "2. sayısal öğrencisi birincisi\n"+
                "çıkış için q ya basın ";
        
        System.out.println("------------------");
        System.out.println(islemler);
        System.out.println("-----------------");
        while(true){
            System.out.println("çıkış için q ya basın ");
            String cevap=scanner.nextLine();
            if(cevap.equals("q")){
                System.out.println("programdan çıklıyor ...");
                break;
            }
                System.out.println("birinci öğrenci ismi :");
                String isim1=scanner.nextLine();
                System.out.print("nerler:(türkçe ,matematik ,edebiyat ,fizik)");
                int turkce1=scanner.nextInt();
                int matematik1=scanner.nextInt();
                int edebiyat1=scanner.nextInt();
                int fizik1=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("ikinci öğrenci ismi :");
                String isim2=scanner.nextLine();
                System.out.print("nerler:(türkçe ,matematik ,edebiyat ,fizik)");
                int turkce2=scanner.nextInt();
                int matematik2=scanner.nextInt();
                int edebiyat2=scanner.nextInt();
                int fizik2=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("üçüncü  öğrenci ismi :");
                String isim3=scanner.nextLine();
                System.out.print("nerler:(türkçe ,matematik ,edebiyat ,fizik)");
                int turkce3=scanner.nextInt();
                int matematik3=scanner.nextInt();
                int edebiyat3=scanner.nextInt();
                int fizik3=scanner.nextInt();
               scanner.nextLine();
               
            System.out.println("işlem giriniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programdan çıklıyor");
                break;
            }
            else if(islem.equals("1")){
               EsitAgırlık ogrenci1=new EsitAgırlık(turkce1,matematik1,edebiyat1,fizik1,isim1);
               EsitAgırlık ogrenci2=new EsitAgırlık(turkce2,matematik2,edebiyat2,fizik2,isim2);
               EsitAgırlık ogrenci3=new EsitAgırlık(turkce3,matematik3,edebiyat3,fizik3,isim3);
               EsitAgırlık birinci=birinci(ogrenci1,ogrenci2,ogrenci3);
               System.out.println("birinci eşit ağırlık öğrencisi:"+birinci.getIsim());
               System.out.println("öğrencinin puanı"+birinci.puan_hesapla());
            }
            else if(islem.equals("2")){
               sayısal ogrenci1=new sayısal(turkce1,matematik1,edebiyat1,fizik1,isim1);
               sayısal ogrenci2=new sayısal(turkce2,matematik2,edebiyat2,fizik2,isim2);
               sayısal ogrenci3=new sayısal(turkce3,matematik3,edebiyat3,fizik3,isim3);
               sayısal birinci=birinci(ogrenci1,ogrenci2,ogrenci3);
               System.out.println("birinci sayısal öğrencisi:"+birinci.getIsim());
               System.out.println("öğrencinin puanı"+birinci    .puan_hesapla());
            }
            else{
                System.out.println("geçersiz işlem...");
            }
        }
        
    }
    public static <E extends Aday> E birinci( E e1,E e2,E e3){ /*Burada <E extends Aday> sadece Aday classını extends eden
        veri tiplerini göndericez diyoruz çünkü eğer genel <E> kullanırsak hata veriyor çünkü bizi int gönderirsek int içinde puan hesapla diye bir method yok . 
        o yüzden sadece Aday classını extend eden değerleri gönderiyoruz*/
       if(e1.puan_hesapla()>e2.puan_hesapla() && e1.puan_hesapla()>e3.puan_hesapla()){
           return e1;
       }
       else if(e2.puan_hesapla()>e1.puan_hesapla() && e2.puan_hesapla()>e3.puan_hesapla()){
           return e2;          
       }
       else if(e3.puan_hesapla()>e1.puan_hesapla() && e3.puan_hesapla()>e2.puan_hesapla()){
           return e3;          
       }
       else{
           return e1;//return hatasından kurtulmak için bütün öğrenciler eşitse rastgele öğrenci dönsün dedik 
       }
    }
    
}
