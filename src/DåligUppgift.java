public class DåligUppgift extends Papper{

    private String uppgift = ":) \n:)";

    public DåligUppgift(){
        super();
    }
    public DåligUppgift(double width, double height){
        super(width,height);
    }
    public DåligUppgift(double width, double height, double deapth, String textContent, String enhet){
        super(width, height, deapth, textContent, enhet);
    }

    public void görEnDåligUppgift(String uppgift){
        this.textContent = uppgift;
        this.uppgift = uppgift;
    }

    public void doItAgain(DåligUppgift uppgift){
        uppgift.setTextContent(this.uppgift);
    }

    public String getUppgift() {
        return uppgift;
    }

    public void setUppgift(String uppgift) {
        this.uppgift = uppgift;
    }

}
