package hackerrank_medium;

import java.util.Scanner;

public class strangecounter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long t=scn.nextLong();
        long i=3;
        long cnt=1;
        while(true){
            if(t<=i){
                break;
            }
            else{
                i=i*2;
                cnt++;
            }
        }
        long time=0;
        time=3*((int)Math.pow(2,cnt-1)-1);
        time++;
        time+=i-t;
        System.out.println(time);
    }
}
