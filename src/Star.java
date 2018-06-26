public class Star {


    public static void main(String[] args) {
//        star1(6);
//        star2(6);
        //      star6(4);

    }


    private static void star1(int limit) {

        for (int n = 0; n < limit; n++) {
            for (int k = 0; k < limit; k++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }


    private static void star2(int limit) {
        for (int n = 1; n < limit; n++) {
            for (int k = 0; k < n; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


    private static void star3(int limit) {
        for (int n = limit; n > 0; n--) {

            for (int k = 0; k < n - 1; k++) {
                System.out.print(" ");
            }


            for (int j = 0; j < limit - n + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    private static void star4(int limit) {
        for (int n = 1; n < limit; n++) {
            for (int k = 0; k < n; k++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void star5(int limit) {
        for (int n = 0; n < limit; n++) {
            for (int k = 1; k < limit - n; k++) {
                System.out.print("A");
            }
            for (int i = 0; i < n + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void star6(int limit) {
        for (int n = 0; n < limit; n++) {
            for (int k = 1; k < limit - n; k++) {
                System.out.print("A");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}

