package objects;

public class challamge3page {

    public static void main(String[] args) {
        subbottomstars(3);
        sidebyside(4);
        cube(5);
        lefttriangle(5);
        righttriangle(5);
        reverselefttriangle(5);
        squarestar(4);
        squarestar1(10);
        squarestar(10);
        triangle(5);
        reversetriangle2(5);
        rightarrow(3);
        leftarrow(5);
        star(3);
        baklava(8);
        star1(5);
        star2(10);
    }

    public static void subbottomstars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void sidebyside(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void cube(int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lefttriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void righttriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverselefttriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            if (i != n - 1) {
                System.out.println();
            }
        }
    }

    public static void squarestar(int n) {
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                //icteki kare sinirlari horizental
                //icteki kare sinirlari vertical
                if ((j < 1 || j > n) || (i == 0 || i == n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }

    public static void squarestar1(int n) {
        String toplam = "*";
        String init = "";
        for (int k = 0; k < n + 1; k++) {
            if (k == 0) {
                for (int j = 0; j < n + 2; j++) {
                    init = init + "*";
                }
                System.out.println(init);
            } else {

                toplam = toplam + " ";
            }
        }

        for (int h = 0; h < n; h++) {
            System.out.println(toplam + "*");
        }
        System.out.println(init);
    }

    public static void triangle(int n) {
        String toplam = "";
        String last = "";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - 1 - i; k++) {
                toplam = toplam + " ";
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                last = last + "*";
            }
            System.out.println(toplam + last + toplam);
            toplam = "";
            last = "";
        }
    }

    public static void reversetriangle2(int n) {
        String last = "";
        String toplam = "";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                toplam = toplam + " ";
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                last = last + "*";
            }
            System.out.println(toplam + last + toplam);
            toplam = "";
            last = "";
        }
    }

    public static void rightarrow(int n) {
        // int i = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void leftarrow(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void baklava(int n) {
        triangle(n);
        String last = "";
        String toplam = "";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                toplam = toplam + " ";
            }
            if (i != 0) {
                for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                    last = last + "*";
                }
                System.out.println(toplam + last + toplam);
                toplam = "";
                last = "";
            }
        }
    }

    public static void star1(int n) {
        reverselefttriangle(n);
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            if (i != 0) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void star2(int n) {
        reversetriangle2(n);
        String toplam = "";
        String last = "";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - 1 - i; k++) {
                if (i != 0) {
                    toplam = toplam + " ";
                }
            }
            if (i != 0) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    last = last + "*";
                }
                System.out.println(toplam + last + toplam);
                toplam = "";
                last = "";
            }
        }
    }
}