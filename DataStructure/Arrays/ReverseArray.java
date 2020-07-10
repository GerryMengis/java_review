package DataStructure.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4};
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(arr.length-1) - i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
            
        }
        System.out.println();
    }
    
}