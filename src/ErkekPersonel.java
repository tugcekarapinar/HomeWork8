import java.time.LocalDate;

public class ErkekPersonel extends Personel{

    public ErkekPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi,65);
    }
}