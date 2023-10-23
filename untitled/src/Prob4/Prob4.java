package Prob4;

import java.util.Vector;

public class Prob4 {
    public static void main(String[] args){
        int aux = 0;
        int[] arr = {10, 20 ,30, 17, 24, 72, 3 ,9};
        for(int i=0; i<arr.length;i++){
            if(arr[i] > 1) {
                aux = 0;
                for (int j = 2; j<arr[i]/2;j++){
                    if(arr[i] % j == 0 ){
//                        System.out.println("Nu e prim" + arr[i]);
                        aux = 1;
                    }
                }
                if(aux==0){
                    System.out.println("e prim " + arr[i]);
                }
            }
        }
    }
}
