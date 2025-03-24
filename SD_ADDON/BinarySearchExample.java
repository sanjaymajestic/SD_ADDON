package addon;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[50];
        int count = 0;

   
        System.out.println("Enter up to 50 integers (enter -1 to stop):");
        while (count < 50) {
            int input = scanner.nextInt();
            if (input == -1) break;
            numbers[count++] = input;
        }

    
        int[] enteredNumbers = Arrays.copyOf(numbers, count);
        Arrays.sort(enteredNumbers);
        System.out.println("Sorted numbers: " + Arrays.toString(enteredNumbers));

     
        System.out.print("Enter a number to search: ");
        int searchValue = scanner.nextInt();
        int index = binarySearch(enteredNumbers, searchValue);
        System.out.println(index >= 0 ? "Number " + searchValue + " found at index: " + index : "Number " + searchValue + " not found.");

        scanner.close();
    }


    public static int binarySearch(int[] array, int value) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) return mid;
            if (array[mid] < value) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
	
	


