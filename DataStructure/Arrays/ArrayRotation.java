package DataStructure.Arrays;

public class ArrayRotation {
    // given array is {1, 2, 3, 4, 5, 6, 7}
    // output array should be {3, 4, 5, 6, 7, 1, 2}

    void rotate(int[] arr, int d, int n){
        for(int i = 0; i < d; i++){
            rotateRight(arr, n);
        } 
    }

    void rotateRight(int[] arr, int n){
        int temp = arr[0];
        int i = 0;
        for(i = 0; i < n-1; i++){
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;

    }

    public void displayArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }

    public static void main(String[] args) {
        int d = 2, n = 7; 
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ArrayRotation arrRotation = new ArrayRotation();
        arrRotation.rotate(arr, d, n);
        arrRotation.displayArr(arr);
        System.out.println();

    }
    
}