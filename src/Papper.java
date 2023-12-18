public class Papper {
    protected double width = 40;
    protected double height = 40;
    protected String textContent = "";
    protected double deapth = 0.02;
    protected String enhet = "cm";

    public Papper(){}
    public Papper(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Papper(double width, double height, double deapth, String textContent, String enhet){
        this.width = width;
        this.height = height;
        this.deapth = deapth;
        this.textContent = textContent;
        this.enhet = enhet;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getTextContent() {
        return textContent;
    }

    public double getDeapth() {
        return deapth;
    }

    public String getEnhet() {
        return enhet;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void setDeapth(double deapth) {
        this.deapth = deapth;
    }

    public void setEnhet(String enhet) {
        this.enhet = enhet;
    }
    public void write(Pena pena, String text){
        this.textContent += text;
    }
}
