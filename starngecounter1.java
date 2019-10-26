package hackerrank_medium;

import java.util.Scanner;

public class starngecounter1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long t=scn.nextLong();
        long time=3;
        long cnt=1;
        long timel=0;
        while(true){
            if(t<=time){
                break;
            }
            else {
                time=time*2+3;
                cnt++;
            }
        }
       timel=3*((long)Math.pow(2,cnt-1)-1)+1;
       long val=3*(long)Math.pow(2,cnt-1);
       val=val-(t-timel);
        System.out.println(val);
    }
}
