package WorkFlow;

public class OrdenarArray {

	public class Main {
	    public static void main(String[] args) {
	        int[] array = {64, 34, 25, 12, 22, 11, 90};
	        
	        System.out.println("Array desordenado:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        
	        int n = array.length;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (array[j] > array[j+1]) {
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	            }
	        }
	        
	        System.out.println("\nArray ordenado:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
	}


}
