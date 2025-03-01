package test;

import java.util.Scanner;
class Main {
   

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After reversing");
        for(int i=n-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            int max=0,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                for(int j=0;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
                }
            }
            System.out.println();
            System.out.println("maximum value :"+max);
            System.out.println("minimum value :"+min);
    }
}