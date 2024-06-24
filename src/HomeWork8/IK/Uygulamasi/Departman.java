package HomeWork8.IK.Uygulamasi;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private List<Personel> personelList = new ArrayList<>();
    private Personel takimLideri;
    private List<Gorev> gorevList = new ArrayList<>();

    public Departman(Personel takimLideri) {
        this.takimLideri = takimLideri;
        AddPersonel(takimLideri);
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public Personel getTakimLideri() {
        return takimLideri;
    }

    public List<Gorev> getGorevList() {
        return gorevList;
    }

    public void setGorevList(List<Gorev> gorevList) {
        this.gorevList = gorevList;
    }

    public void ChangeTakimLideri(Personel takimLideri) {
        this.takimLideri = takimLideri;
        if (!personelList.contains(takimLideri)) {
            personelList.add(takimLideri);
        }
        System.out.println("Yeni Takım Lideri = " + takimLideri.getAd());
    }

    public void AddPersonel(Personel newPersonel) {
        personelList.add(newPersonel);
        System.out.println("Takıma Katıldı = " + newPersonel.getAd());
    }

    public void DeletePersonel(Personel personel) {
        personelList.remove(personel);
        System.out.println("Takımdan Çıkarıldı = " + personel.getAd());
    }

    public void ChangePersonel(Personel oldPersonel, Personel newPersonel) {
        DeletePersonel(oldPersonel);
        AddPersonel(newPersonel);
    }

    public void AddGorev(Gorev gorev) {
        gorevList.add(gorev);
        System.out.println(gorev.getGorevTanimi() + " Görevi Alındı");
    }

    public void ChangeGorevTamamlandiMi(Gorev gorev, boolean tamamlandiMi) {
        var index = gorevList.indexOf(gorev);
        gorevList.get(index).setTamamlandiMi(tamamlandiMi);
        if(tamamlandiMi){
            System.out.println(gorev.getGorevTanimi() + " Görevi Tamamlandı");
        }
    }
}