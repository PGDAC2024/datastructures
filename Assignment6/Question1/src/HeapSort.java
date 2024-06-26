import java.util.Arrays;

public class HeapSort {
    public static void Heapify(int [] arr , int n,int i) {
    	int smallest = i;
    	int left = 2*i +1;
    	int right = 2*i+2;
    	
    	if(left<n && arr[left]<arr[smallest]) {
    		smallest = left;
    	}
    	if(right<n && arr[right] < arr[smallest]) {
    		smallest = right ;
    	}
    	
    	if(smallest != i) {
    		int temp = arr[i];
    		arr[i]=arr[smallest];
    		arr[smallest] = temp;
    	    Heapify(arr,n,smallest);
    	}
    }
    
    public static void heapsort(int arr[]) {
    	int n = arr.length;
    	
    	for (int i = n/2-1; i>=0; i--) {
			Heapify(arr,n,i);   
		}
    	
    	for (int i = n-1; i >= 0; i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]= temp;
			
			Heapify(arr,i,0);
		}
    }
	
	public static void main(String[] args) {
		 int arr [] = {23};
         heapsort(arr);
         System.out.println(Arrays.toString(arr));
	}

}
