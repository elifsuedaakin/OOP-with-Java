
public class hesap {
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public hesap(String kullanıcı_adı, String parola, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {//ekstradan metot yazmamıza gerek yok burdan bakiyemizi öğrenebiliriz
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void ParaYatır(int tutar){
        bakiye+=tutar;
        System.out.println("yeni bakiyeniz");
    }
    public void ParaCek(int tutar){
       if(bakiye-tutar<0){
           System.out.println("yeterli bakiyeniz yok");
       }
       else{
           bakiye-=tutar;
           System.out.println("yeni bakiyeniz"+bakiye);
       }
    }
}
