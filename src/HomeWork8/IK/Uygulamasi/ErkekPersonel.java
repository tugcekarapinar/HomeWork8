package HomeWork8.IK.Uygulamasi;

import java.time.LocalDate;
import java.time.Period;

public class ErkekPersonel extends Personel{

    public ErkekPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public void EmeklilikHesapla() {
        Period period = Period.between(dogumTarihi, LocalDate.now());
        int yas = period.getYears();

        if (yas >= 65) {
            System.out.println(ad + " Bey" + " = Emeklilik Yaşınız Gelmiştir.");
        } else {
            System.out.println(ad + " Bey" + " = Emekliliğe Kalan Yıl = " + (65 - yas));
        }
    }
}