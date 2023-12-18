public class klass extends arv {
    private String klass = "Det är är en klass, typ en ritning för ett objekt" +
            "\n det är också en egenskap, typ bara en bit av data";
    private String objekt = "Jag är inte ett objekt";
    private String overloading = "Sker när man har flera versioner av en function/metod som kan ta in olika mängder värden.";
    private String super_ = "\"super\" kan användas för att köra funktioner i den ärvda klassen och dess constructor.";

    public klass(){
        super();
        this.objekt = "om jag nu instansieras är jag ett objekt";

    }
    public klass(String overload){
        super();
        this.objekt = "om jag nu instansieras är jag ett objekt";
        this.overloading = overload;
    }
    public String polymorfism(){
        System.out.println("Här händer något annat");
        System.out.println("Genom att skriva: super.polymorfism(); kan jag använda polymorfism från klassen som funktionen är ärvd av");
        return null;
    }
    public String polymorfismFrånArv(){
        super.polymorfism();
        System.out.println(super_);
        return null;
    }


    public String getKlass() {
        return klass;
    }

    public String getObjekt() {
        return objekt;
    }

    public String getOverloading() {
        return overloading;
    }

    public String getSuper_() {
        return super_;
    }
}
