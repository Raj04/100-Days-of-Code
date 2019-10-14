
import java.io.*;
//move all zeros to the end of the array

//ip-6, 0, 8, 2, 3, 0, 4, 0, 1
//op-6 8 2 3 4 1 0 0 0 

class MoveZero {
	public static void main (String[] args) {
    
        int temp=0;
        int arr[]={ 6, 0, 8, 2, 3, 0, 4, 0, 1};
        for(int i=0;i<arr.length;i++){
		//we will check if current_element is Zero and swap with next non zero element
		//arr[j]!=0 condition is responsible for the swap only for non zero element
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==0 && arr[j]!=0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                /*for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }System.out.println();*/
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
	}
	
}
