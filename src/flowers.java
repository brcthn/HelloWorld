public class flowers {
    public String color = "red";
    public int high;
    public boolean live;
    public boolean poison;
    public String season;

    public float difference(int first,int end){
        float difference = end-first;
        if(difference<0) {
            return  0.0f;

        }else{

           return difference;
        }
    }


}
