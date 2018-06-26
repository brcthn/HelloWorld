package alive;

public class MyClass {

    public static void main(String[] args) {

        Cats tekir = new Cats("Pamuk");
        tekir.setKind("Tekir");
        tekir.setKilo(2);
        tekir.setWild(false);
        tekir.setColor("Grey");
        tekir.setCute(true);
        tekir.setHas4Legs(true);
        tekir.setVoice("Miyaawwww");
        tekir.setAge(2);


        Cats van = new Cats("karTanesi");
        van.setEyecolor("blue");
        van.setAge(2);
        van.setColor("gray");
        van.setGender(" boy ");
        van.setCute(true );
        van.setVoice("miyaww");


        Cats cita = new Cats("Aslan");
        cita.setCute(false);
        cita.setColor("yellow or gray");
        cita.setEyecolor("blue");
        cita.setGender("girl");
        cita.setVoice("krrrr");
        cita.setAge(5);


        Cats leopar = new Cats ("Leo");
        leopar.setAge(6);
        leopar.setVoice("krrr");
        leopar.setGender("girl ");
        leopar.setColor(" brown");
        leopar.setIsteeth(true);
        leopar.setTailLength(25);

        tekir.sesCikarma();
        leopar.sesCikarma();
        cita.sesCikarma();
        van.sesCikarma();

    }


}
