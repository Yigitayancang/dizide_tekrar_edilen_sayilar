import java.util.Arrays;
public class pratil {

        static boolean isfin (int [] arry  , int value){
            for(int i : arry){
                if(i == value){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {   
        int startindex = 0;
        int [] list = { 1 , 2 ,  1 , 6 ,7 ,7 ,  9, 10 , 12 , 1 , 12 , 52 };
        int [] dub = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(((i!=j) && ( list[i] ==list [j]))){

                    if(!isfin(dub, list [i])){
                         dub[startindex++] = list[i]; 
                        

                    }
                    break;

                }


            }
        }
        
       System.out.println(Arrays.toString(dub));
    }
    
}