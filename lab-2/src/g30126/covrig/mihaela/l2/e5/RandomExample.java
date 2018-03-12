package g30126.covrig.mihaela.l2.e5;

import java.util.Random;

public class RandomExample {
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                int i;
                Random r = new Random();
            	for(i=0;i<6;i++){
            		arr[i]=r.nextInt(30);
            	}
                 
                System.out.println("Array Before Bubble Sort");  
                for(i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}
