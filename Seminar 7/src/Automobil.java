public class Automobil {
    public String descriere(){
        return "Automobilul este functional";
    }
}

class MasinaFamilie extends Automobil {
    public String Locuri(){
        return "Masina are 3 locuri suplimentare";
    }

    public String descriere() {
        return "Masina de Familie";
    }
}

class MasinaElectrica extends Automobil {
    public String Incarcare(){
        return "Masina se incarca la statie electrica";
    }

    public String descriere() {
        return "Masina de Electrica";
    }
}

class MasinaSport extends Automobil {
    public String hp(){
        return "Masina are 800 de cai putere";
    }

    public String descriere() {
        return "Masina de Sport";
    }
}

class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaElectrica masinaElectrica;
    private MasinaSport masinaSport;

    public DealerAuto(){
        masinaFamilie=new MasinaFamilie();
        masinaElectrica=new MasinaElectrica();
        masinaSport=new MasinaSport();
    }

    public String getFamilie(){
        return masinaFamilie.Locuri() + ". " + masinaFamilie.descriere();
    }

    public String getElectrica(){
        return masinaElectrica.Incarcare() + ". " + masinaElectrica.descriere();
    }

    public String getSport(){
        return masinaSport.hp() + ". " + masinaSport.descriere();
    }
}