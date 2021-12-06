package sk.uniza.fri;

public class Hrac {
    private final String meno;
    private final String znak;

    public Hrac(String meno, String znak) {
        this.meno = meno;
        this.znak = znak;
    }

    public String getMeno() {
        return this.meno;
    }

    public String getZnak() {
        return this.znak;
    }

}
