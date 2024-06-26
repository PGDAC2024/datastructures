package Assignment6.q2;

import java.util.Arrays;

class Heap {
    int arr[];
    int count;

    public Heap(int size) {
        arr = new int[size];
        count = 0;
    }

    public void add(int value) {
        if (count == arr.length) {
            throw new IllegalStateException("Heap is full");
        }
        arr[count] = value;
        int ci = count;
        count++;
        
        // Corrected the parent index calculation and bubble up process
        while (ci > 0) {
            int pi = (ci - 1) / 2;
            if (arr[ci] < arr[pi]) {
                int temp = arr[ci];
                arr[ci] = arr[pi];
                arr[pi] = temp;
                ci = pi;
            } else {
                break;
            }
        }
    }

    public int delete() {
        if (count == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = arr[0];
        arr[0] = arr[count - 1];
        count--;

        int pi = 0;
        int ci = 2 * pi + 1;

        while (ci < count) {
            if (ci + 1 < count && arr[ci] > arr[ci + 1]) {
                ci++;
            }

            if (arr[pi] <= arr[ci]) {
                break;
            }

            int temp = arr[ci];
            arr[ci] = arr[pi];
            arr[pi] = temp;

            pi = ci;
            ci = 2 * pi + 1;
        }

        return min;
    }
    
    public void display() {
    	  System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, count)));
    }
}


public class priorityQue {
  public static void main(String[] args) {
	Heap h1 = new Heap(5);
	
	h1.add(13);
	h1.add(12);
	h1.add(5);
	h1.add(2);
	h1.add(6);
	
	h1.display();
}
}
