package pl.jaksienauczyc;

public class Garnek {

    int srednica;
    int wysokosc;
    String kolor;

    public Garnek() {

    }
    public Garnek (int srednica, int wysokosc) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }
    public Garnek (int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }
    public String gotuj() {
        return "Gotowanie w trakcie";
    }

        public String gotuj(boolean czyDodalismySol){
            if (czyDodalismySol) {
                return "Gotowanie z solą";
            } else {
                return "Gotowanie bez soli";
            }
            }
        public int zwrocTemperatureWrzeniaWody() {
        return 100;
        }
    }

