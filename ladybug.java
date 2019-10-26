package hackerrank_medium;

import java.util.HashMap;
import java.util.Scanner;

public class ladybug {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int g = scn.nextInt();
        while (g > 0) {
            int n = scn.nextInt();
            char[] arr = new char[n];
            String str = scn.next();
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }
//            int c = 0;
            int i = 1;

            while (i < arr.length) {
                if(arr[0]!=arr[1])
                    break;
                if (arr[i] == arr[i-1]) {
                    i++;

                }
                else if(i!=arr.length-1) {
                if(arr[i]==arr[i+1])
                    i++;
                else break;
                }
                else
                 break;
            }
            if (i == arr.length && arr.length>1) {
                System.out.println("YES");
                g--;
                continue;
            } else {

                int k = -1;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == '_') {
                        k = 0;
                        break;
                    }
                }
                if (k == -1) {
                    System.out.println("NO");
                    g--;
                    continue;
                } else {
//                    System.out.println("as");
                    HashMap<Character, Integer> map = new HashMap<>();
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] != '_') {

                            if (!map.containsKey(arr[j])) {
                                map.put(arr[j], 1);
                            } else map.put(arr[j], map.get(arr[j]) + 1);
                        }
                    }
                    int t = -1;
//                    System.out.println(map);
                    for (char val : map.keySet()) {
                        if (map.get(val) < 2) {
                            t = 0;
                            break;
                        }
                    }
                    if (t == 0) {
                        System.out.println("NO");
                        g--;
                        continue;
                    } else {
                        System.out.println("YES");
                    }
                }
            }
            g--;
        }
    }

}
