package hackerrank_medium;

import java.util.Scanner;

public class surfacearea3d {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int h=scn.nextInt();
        int w=scn.nextInt();
        int area=0;
        int arr[][]=new int[h+2][w+2];
        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                area+=2;
                if(arr[i][j]>arr[i][j-1]){
                    area+=arr[i][j]-arr[i][j-1];
                }
                if(arr[i][j]>arr[i][j+1]){
                    area+=arr[i][j]-arr[i][j+1];
                }
                if(arr[i][j]>arr[i+1][j]){
                    area+=arr[i][j]-arr[i+1][j];
                }
                if(arr[i][j]>arr[i-1][j]){
                    area+=arr[i][j]-arr[i-1][j];
                }

            }
        }
        System.out.println(area);
    }
}
