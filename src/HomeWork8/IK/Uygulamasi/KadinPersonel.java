package HomeWork8.IK.Uygulamasi;

import java.time.LocalDate;

public class KadinPersonel extends Personel {

    public KadinPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi,60);
    }
}