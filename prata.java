package spoj;

import java.util.Scanner;

public class prata {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            int p=scn.nextInt();
            int l=scn.nextInt();
            int[] arr=new int[l];
            int max=Integer.MAX_VALUE;
            for(int i=0;i<l;i++){
                arr[i]=scn.nextInt();

            }
            for(int i=0;i<l;i++){
                if(arr[i]<max){
                    max=arr[i];
                }
            }
            int ans=0;
            int maxtime=(max*((p*(p+1))/2))%10000007;

            int start=0;
            int end=maxtime;
            while(start<=end){
                int  mid=(start+end)/2;
//                System.out.println("mid:"+mid);
                int sum=0;
                for(int i=0;i<arr.length && sum<=p ;i++){
                    int n=(int)((Math.sqrt(((8*mid)/arr[i])+1)-1)/2);
                    sum+=n;
                }
//                System.out.println(sum);
                if(sum>=p){
                    end=mid-1;
                    ans=mid;
                }
                else if(sum<p){
                    start=mid+1;
                }


            }
            System.out.println(ans);
            t--;
        }
    }
}
