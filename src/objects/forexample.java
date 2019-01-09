package objects;

public class forexample {
    public static void main(String[] args) {
       // for(int i=0;i<101;i=i+1)
         //   System.out.println("8" + "*" + i + "="+ 8*i);

       // for(int j=1;j<11;j++)
        //    for(int k=0; k<101;k++)
        //        System.out.println(j+"*" +k + "="+j*k);


        System.out.println(volwes("aysemneolurgeridon"));
    }

    private static String volwes(String name) {
        String result = "";
        char[] list = name.toCharArray();

        for(int i=name.length(); i>0 ;i--) {
            result = result + list[i-1];
        }

        return result;

    }


}
