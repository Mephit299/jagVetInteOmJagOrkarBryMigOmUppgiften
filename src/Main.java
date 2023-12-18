public class Main {
    public static klass objekt = new klass();
    private static DåligUppgift trevligt = new DåligUppgift();
    public static void main(String[] args) {
        System.out.println(trevligt.getUppgift());

        System.out.println(objekt.polymorfismFrånArv());
        System.out.println(objekt.polymorfism());

        // okej jag har ingen aning om hur protected fungerar.
        System.out.println("\n" + objekt.protected_);
        objekt.protected_ = "2";
        System.out.println(objekt.protected_);
        System.out.println("\nJag är osäker om det går att restriktera variabler så att de ändas kan ändras i sin klass när man vill ärva dom variablerna.");
        System.out.println("\n\nallting är lite huller om buller men jag orkar inte bry mig för att göra det här på ett bra sätt");
    }
}