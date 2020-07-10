package DataStructure.Arrays;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Tesla");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)); 
        }

    }
    
}