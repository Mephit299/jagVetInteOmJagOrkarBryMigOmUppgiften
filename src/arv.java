public class arv {
    protected String arv = "Det här är en variabel som en klass kan ärva genom att extenda klassen.";
    private String parent = "Det här är parant klassen till klassen klass." +
            "\nFör att klassen klass ärver av den här klassen kommer den kalls paren och klassen klass är en subclass." +
            "\nKlassen klass komer inte kunna koma åt den här variabeln för den är private.";
    protected String protected_ = "En protected class fungerar som en private klass men kan ses och ändras i en subclass.";
    private String private_ = "En egenskap som är private kan ändas ändras i klassen, inte utifrån och ärvs inte av en klass";
    public String public_ = "Kan ändras och användas utifrån";

    public arv(){}

    protected String  polymorfism(){
        System.out.println("og polymorfism");
        return null;
    }

}
