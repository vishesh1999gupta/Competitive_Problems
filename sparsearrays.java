package hackerrank_medium;

import java.util.HashMap;
import java.util.Scanner;

public class sparsearrays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=scn.next();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else map.put(s,1);
        }
        int q=scn.nextInt();
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            String s=scn.next();
            if(map.containsKey(s)){
                ans[i]=map.get(s);
            }
            else ans[i]=0;
        }
        for(int i=0;i<q;i++){
            System.out.println(ans[i]);
        }
    }
}
