package addon;

public class zeros {
	 public static void main(String[] args) {
	        int[] arr = {3, 0, 4, 0, 5, 0, 6, 0, 7};

	        System.out.println("");
	        printArray(arr);

	        moveZerosToEnd(arr);

	        System.out.println("\nArray after moving zeros to the end:");
	        printArray(arr);
	    }

	    public static void moveZerosToEnd(int[] arr) {
	        int nonZeroIndex = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[nonZeroIndex] = arr[i];
	                if (nonZeroIndex != i) {
	                    arr[i] = 0;
	                }
	                nonZeroIndex++;
	            }
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();   
	    }
	}

