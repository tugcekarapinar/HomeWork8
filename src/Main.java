import HomeWork8.IK.Uygulamasi.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        KadinPersonel kadinPersonel1 = new KadinPersonel("Tugce", "Çelik", LocalDate.of(1993, 1, 11));
        ErkekPersonel erkekPersonel1 = new ErkekPersonel("Tugay", "Karapinar", LocalDate.of(1992, 11, 28));
        KadinPersonel kadinPersonel2 = new KadinPersonel("Ayşe", "Çalışkan", LocalDate.of(1960, 1, 1));
        ErkekPersonel erkekPersonel2 = new ErkekPersonel("Ali", "Veli", LocalDate.of(1980, 2, 2));

        Departman yazilimTest = new Departman(kadinPersonel2);
        yazilimTest.AddPersonel(kadinPersonel1);
        yazilimTest.AddPersonel(erkekPersonel1);
        yazilimTest.AddPersonel(erkekPersonel2);

        for (Personel personel : yazilimTest.getPersonelList()) {
            personel.EmeklilikHesapla();
        }

        System.out.println("-------------------------");

        yazilimTest.ChangeTakimLideri(kadinPersonel1);
        yazilimTest.DeletePersonel(kadinPersonel2);

        for (Personel personel : yazilimTest.getPersonelList()) {
            personel.EmeklilikHesapla();
        }

        System.out.println("-------------------------");

        ErkekPersonel erkekPersonel3 = new ErkekPersonel("Demir", "Ege", LocalDate.of(2023, 12, 14));
        yazilimTest.ChangePersonel(erkekPersonel2, erkekPersonel3);

        for (Personel personel : yazilimTest.getPersonelList()) {
            personel.EmeklilikHesapla();
        }

        System.out.println("-------------------------");

        Gorev gorev1 = new Gorev("Test Adımları Yazma", false);
        Gorev gorev2 = new Gorev("Test Koşma", false);
        Gorev gorev3 = new Gorev("Test Sonuç Raporu Yazma", false);

        yazilimTest.AddGorev(gorev1);
        yazilimTest.AddGorev(gorev2);
        yazilimTest.AddGorev(gorev3);

        for (Gorev gorev : yazilimTest.getGorevList()) {
            System.out.println(gorev.getGorevTanimi() + " Gorevi Tamamlanma Durumu = " + gorev.getTamamlandiMi());
        }

        System.out.println("-------------------------");

        yazilimTest.ChangeGorevTamamlandiMi(gorev1, true);
        yazilimTest.ChangeGorevTamamlandiMi(gorev2, true);
        yazilimTest.ChangeGorevTamamlandiMi(gorev3, true);

        for (Gorev gorev : yazilimTest.getGorevList()) {
            System.out.println(gorev.getGorevTanimi() + " Gorevi Tamamlanma Durumu = " + gorev.getTamamlandiMi());
        }
    }
}