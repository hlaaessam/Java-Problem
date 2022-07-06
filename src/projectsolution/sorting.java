
package projectsolution;

import java.util.*;



 
public class sorting {
    static int find_dominator(int arr[], int array_length) {
        Arrays.sort(arr);
        int max_count = (array_length / 2), res = -1;
        int curr_count = 1;
 
        for (int i = 1; i < array_length; i++) {
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            } else {
                if (curr_count > max_count) {
                    res = arr[i - 1];
                    break;
                }
            }
        }
 
        return res;
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter the number of elements to be stored in the array");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the elements of the array: ");
        for (int counter = 0; counter < array_size; counter++) {
            System.out.print("A[" + counter + "] = ");
            array[counter] = input.nextInt();
        }
        int[] sorted_array = array.clone();
        int dom = find_dominator(sorted_array, array_size);
        System.out.println("\n");
        if (dom == -1) {
            System.out.println(-1);
        } else {
            for (int counter = 0; counter < array_size; counter++) {
                if (array[counter] == dom) {
                    System.out.println(counter);
                }
            }
 
        }
    }
}