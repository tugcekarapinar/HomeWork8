package HomeWork8.IK.Uygulamasi;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personel {
    protected String ad;
    protected String soyad;
    protected LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
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

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public abstract void EmeklilikHesapla();
}