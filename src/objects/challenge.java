package objects;

public class challenge {
    public static void main(String[] args) {
        sentence("Seni cok seviyorum Askim");
        sum(30,40,50,30,60);
        multiplicationtable();
        seven();
        eleven();
        number(100);
        lastvowels("burcu");
        combining("burcu","hasan");
        same("gotum bu sorulur mu");
        add('a');
        factorial(5);
        vowel("burcuhasan");

    }

    public static void sentence(String text) {
        System.out.println(text);
    }


    public static void sum(int n, int k,int l, int i, int m){
        System.out.println(n+k+l+i+m);
    }

    public static void multiplicationtable() {
    for (int h=1; h < 11; h++){
      for(int k=1;k<11;k++) {
          System.out.println(h + "*" + k + "=" + h * k);

      }
    }
}



       public static void seven(){
        for(int i=1;i<15;i++) {
            System.out.println(7*i);
        }
  }

         public static void eleven(){
        for(int i=1;i<10;i++){
            System.out.println(11*i);
        }
 }

        public static void number(int n){
        for(int i=1;i<100;i++){
            int result=i*n;
            if(result<101){
                System.out.println(result);
            }
        }
}
        public static void lastvowels(String text){
    System.out.println(text.charAt(text.length()-1));

}
        public static void combining(String first,String second){
            String last=first.concat(second);
            System.out.println(last);
        }

        public static void same(String text){
            System.out.println(text);
        }

        public static void add(char n){
            String s=String.valueOf(n);
            String last=s.concat(s);
            System.out.println(last);

        }
        public static void factorial(int n){
            if(n<0){
                System.out.println("sifirdan buyuk bir sayi giriniz");
            }
            if(n==0){
                System.out.println(1);
            }
            if(n>1){
                int carpim =1;
                for(int i=1;i<n ;i++){
                    carpim=carpim*(n-i);
                }
                System.out.println(n*carpim);
            }
        }

        public static void  vowel( String text){
        String toplam=" ";
        char[] list=text.toCharArray();
        for(int i=0;i<text.length();i++){
            if(list[i]== 'a' || list[i]=='e' || list[i]=='i'||list[i]=='ö'|| list[i]=='ü'|| list[i]=='o'||list[i]=='u'){
                toplam=toplam+ list[i];
            }
        } System.out.println(toplam);


        }

}
