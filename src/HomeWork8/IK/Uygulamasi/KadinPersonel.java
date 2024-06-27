package HomeWork8.IK.Uygulamasi;

import java.time.LocalDate;
import java.time.Period;

public class KadinPersonel extends Personel {

    public KadinPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public void EmeklilikHesapla() {
        Period period = Period.between(dogumTarihi, LocalDate.now());
        int yas = period.getYears();

        if (yas >= 60) {
            System.out.println(ad + " Hanım" + " = Emeklilik Yaşınız Gelmiştir.");
        } else {
            System.out.println(ad + " Hanım" + " = Emekliliğe Kalan Yıl = " + (60 - yas));
        }
    }
}