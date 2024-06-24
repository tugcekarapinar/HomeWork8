package HomeWork8.IK.Uygulamasi;

import java.time.LocalDate;
import java.time.Period;

public class Personel {
    private String ad;
    private String soyad;
    private LocalDate dogumTarihi;
    protected int emeklilikYasi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi, int emeklilikYasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.emeklilikYasi = emeklilikYasi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public int getEmeklilikYasi() {
        return emeklilikYasi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public void EmeklilikHesapla() {
        Period period = Period.between(dogumTarihi, LocalDate.now());
        int yas = period.getYears();

        if (yas >= emeklilikYasi) {
            System.out.println(ad + " = Emeklilik Yaşınız Gelmiştir.");
        } else {
            System.out.println(ad + " = Emekliliğe Kalan Yıl = " + (emeklilikYasi - yas));
        }
    }
}