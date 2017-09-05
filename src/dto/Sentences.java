package dto;


public class Sentences {

    /**
     * Slovní zásoba přívlastků
     */
    private String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    /**
     * Slovní zásoba předmětů
     */
    private String[] podmety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    /**
     * Slovní zásoba příslovcí
     */
    private String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se spožděním"};
    /**
     * Slovní zásoba sloves
     */
    private String[] slovesa = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    /**
     * Slovní zásoba příslovečných určení místa
     */
    private String[] pum = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};


    public String getPrivlastky(int n) {
        return this.privlastky[n];
    }

    public String[] getPodmety() {
        return this.podmety;
    }

    public String[] getPrislovce() {
        return prislovce;
    }

    public String[] getSlovesa() {
        return slovesa;
    }

    public String[] getPum() {
        return pum;
    }

    public int numberOfWords(){
        return privlastky.length;
    }

}
