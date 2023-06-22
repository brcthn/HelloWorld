package alive;

public class Cats extends Animal{

    String color;
    int tailLength;
    boolean has4Legs;
    boolean isCute;
    String kind;
    String eyecolor;

    //constructor


    public Cats(String name) {
        this.name = name;
    }


    // behavioral
    public void sesCikarma(){
        System.out.println(voice);
    }


    // getters & setters
    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public boolean isHas4Legs() {
        return has4Legs;
    }

    public void setHas4Legs(boolean has4Legs) {
        this.has4Legs = has4Legs;
    }

    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }
}
