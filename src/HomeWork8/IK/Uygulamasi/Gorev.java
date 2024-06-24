package HomeWork8.IK.Uygulamasi;

public class Gorev {
    private String gorevTanimi;
    private boolean tamamlandiMi;

    public Gorev(String gorevTanimi, boolean tamamlandiMi) {
        this.gorevTanimi = gorevTanimi;
        this.tamamlandiMi = tamamlandiMi;
    }

    public String getGorevTanimi() {
        return gorevTanimi;
    }

    public boolean getTamamlandiMi() {
        return tamamlandiMi;
    }

    public void setGorevTanimi(String gorevTanimi) {
        this.gorevTanimi = gorevTanimi;
    }

    public void setTamamlandiMi(boolean tamamlandiMi) {
        this.tamamlandiMi = tamamlandiMi;
    }
}