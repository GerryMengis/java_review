package DataStructure.Arrays;

public class Arrays {
    public static void sum(int[] arry2){
        int sum = 0;

        for (int i = 0; i < arry2.length; i++) {
            sum += arry2[i];
        }
        System.out.println("sum of arr2 = "+ sum);
    }

    public static void main(String[] args) {

        // one way of assign Array
        // one Dimentional Array
        int[] arry1 = new int[3];
        arry1[0] = 10;
        arry1[1] = 30;
        arry1[2] = 30;

        for (int i = 0; i < arry1.length; i++) {
            System.out.println("element of arr1[" + i+"] = "+ arry1[i]);
        }
        System.out.println("----------------------------");
        
        // other way of assign Array
        // one Dimentional Array
        int[] arry2 = {10, 20, 30};
        for (int i = 0; i < arry2.length; i++) {
            System.out.println("element of arr2[" + i+"] = "+ arry2[i]);
        }
        System.out.println("----------------------------");

        // copy single dimetional Arrays is "Deep copy"
        int[] copyarry2 = arry2.clone();
        for (int i = 0; i < copyarry2.length; i++) {
            System.out.println("element of copyarry2[" + i+"] = "+ copyarry2[i]);
        }
        arry2[2] = 40;//cloning single dimentional Array doesn't get affected
        for (int i = 0; i < copyarry2.length; i++) {
            System.out.println("Updated element of copyarry2[" + i+"] = "+ copyarry2[i]);
        }
        System.out.println("----------------------------");

        // 2D-Dimentional Array
        int[][] arry2D = {{1, 2, 3},{10, 20, 30}}; //2*3 dimentions
        System.out.println("2D Array size " + arry2D.length);

        for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println("arry2D["+i+"]"+"["+j+"] = " + arry2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // Cloning 2D array is a "Shallow copy"
        int[][] copyarry2D = arry2D.clone();
        for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println("copyarry2D["+i+"]"+"["+j+"] = " + copyarry2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // now updating Arry2D
        arry2D[0][2] = 4;
        arry2D[1][2] = 40;
        for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println(" Updated arry2D["+i+"]"+"["+j+"] = " + arry2D[i][j]);
            }          
        }
        System.out.println("----------------------------");

         // now check copyarry2D get Affected by changing arry2D 
         for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println("copyarry2D["+i+"]"+"["+j+"] = " + copyarry2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // passing array to a function sum
        sum(arry2);
        System.out.println("----------------------------");

        // Array of object
        Student[] stObj = new Student[3]; 

        stObj[0] = new Student(1, "Gerry");
        stObj[1] = new Student(2, "Sam");
        stObj[2] = new Student(3, "Bob");
        for (int i = 0; i < stObj.length; i++) {
            System.out.println("element of stObj[" + i+"] = "+ 
                                    stObj[i].st_role + " " + stObj[i].st_name); 
        }
        System.out.println("----------------------------");

    }
}

class Student{
    public int st_role;
    public String st_name;

    Student(int role, String name){
        st_role = role;
        st_name = name;
    }
}