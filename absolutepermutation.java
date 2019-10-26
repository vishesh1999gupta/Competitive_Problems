package hackerrank_medium;

import java.util.Scanner;

public class absolutepermutation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[] ans=perm(n,k);
            for(int val:ans)
                System.out.print(val+" ");
            System.out.println();
            t--;
        }
    }

    private static int[] perm(int n, int k) {
        int[] ans=new int[n];
        int count=1;
        if(k!=0 && n%(2*k)==0){
            for(int i=0;i<n;i+=2*k){
                for(int j=i;j<i+k;j++){
                    ans[j]=j+k+1;
                }
                for(int j=i+k;j<i+2*k;j++){
                    ans[j]=j-k+1;
                }
            }
            return ans;
        }
        else if(k==0){
            for(int i=0;i<n;i++){
                ans[i]=i+1;
            }
            return ans;
        }
        else {
            int[] alt=new int[1];
            alt[0]=-1;
            return alt;
        }
    }
}
