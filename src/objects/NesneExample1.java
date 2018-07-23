package objects;

public class NesneExample1 {

    public static void main(String[] args) {
        int hacim = volume(10, 20, 30);
        System.out.println(hacim);


        Cupe kup = new Cupe();
        kup.setDepth(10);
        kup.setHeight(20);
        kup.setWidth(30);

        System.out.println(kup.volume());


    }

    private static int volume(int i, int i1, int i2) {
        return i*i1*i2;
    }

}
