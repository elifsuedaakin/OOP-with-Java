import java.util.Scanner;
public class Main { 
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("idman programına hoş geldiniz");
        String idmanlar="geçerli hareketler\n"
                 +"burpee(\n"
                +"pushup(şınav)\n"
                +"situp(mekik)\n"
                +"squad\n";
        scanner.nextLine();
        System.out.println("idmanlaar"+idmanlar);
        System.out.println("bir idman oluşturun ");
        
        System.out.println("burpee sayısı");
        int burpee=scanner.nextInt();
        
        System.out.println("pushup sayısı");
        int pushup=scanner.nextInt();
        
        System.out.println("situp sayısı");
        int situp=scanner.nextInt();
        
        System.out.println("squad sayısı");
        int squad=scanner.nextInt();
        ıdman ıdman=new ıdman(burpee,pushup,situp,squad);
        System.out.println("idmanınız başlıyor");
        while(ıdman.idmanBittiMi()==false){
            System.out.println("hareket türü(burpee,pushup,situp,squad)");
            String tur=scanner.nextLine();
            System.out.println("bu hareketten kaç tane yapacaksınız");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            ıdman.hareketYap(tur, sayi);
        }
    }
}
