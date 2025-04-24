public class Kart {
private char deger; //kartlarımızın değeri
private boolean tahmin=false;//ilk başta hiçbir kart tahmin edilmediği için false olarak başlatmış olduk
public Kart(char deger){
  
    this.deger=deger;
}

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }

}
