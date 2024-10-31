import java.util.*;


public class SeatingCombination{
    public static void main(String[] args){
        int n = 4; //Number of Seat 
        int k = 2; // Number of person or queen
        boolean []checkBox = new boolean[n];
        seatingPlan(checkBox,k,0,"",0);
    }
    public static void seatingPlan(boolean box[],int k,int nop,String ans,int idx){

        if(k == nop){
            System.out.println(ans);
            return;
        }

        for(int i=idx;i<box.length;i++){
            if(box[i] == false){
                box[i] = true;
                seatingPlan(box,k,nop+1, ans + "b" + i + "q" + nop, i+1);
                box[i] = false;
            }
        }
    }
}