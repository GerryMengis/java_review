package DataTypes;

public class Arrays {
    public static void main(String[] args) {

        // Single array
        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[1]);

        cars[3] = "Tesla";
        for(int i = 0; i < cars.length; i++){
        System.out.print(cars[i] + " ");
        }

        // multidimentional Array
        int myNumbers[][] = { {1, 2, 3, 4}, {5, 6, 7,8} };
        System.out.println(myNumbers.length);
        for(int i = 0; i < myNumbers.length; i++){
            for(int j = 0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }

        // Binary search in Array
        int binarySearch[] = {1, 2 ,3 ,4};
        int value = 3;
        for(int i = 0; i < binarySearch.length; i++){
            if (binarySearch[i] == value){
                System.out.println("value found at index " +i);
            }
            
        }
            System.out.println("value not found ");

        // Binary sort in Array

        System.out.print("\n\n");

    }
    
}