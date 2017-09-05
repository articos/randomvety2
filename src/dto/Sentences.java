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


    public String getPrivlastky(int n) { return this.privlastky[n]; }

    public String getPodmety(int n) { return this.podmety[n]; }

    public String getPrislovce(int n) { return prislovce[n]; }

    public String getSlovesa(int n) { return slovesa[n]; }

    public String getPum(int n) { return pum[n]; }

    public int numberOfWords() { return privlastky.length; }

}
