package OOP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_ArrayList_hashMap{

    public static void main(String[] args) {
        System.out.println("This is Array");
   
        // Array 
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0]);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Array List
        System.out.println("Array List");
        int n = 4;
        ArrayList<Integer> arrList = new ArrayList<>(n);
        
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);  
        arrList.add(40);
        arrList.add(50);
 

        System.out.println(arrList);
        System.out.println(arrList.get(0));
        System.out.println(arrList.remove(0));
        arrList.clear();

        for(int i=0; i < n; i++){
            arrList.add(i);
        }
        System.out.println(arrList);

        // List
        // void add(int index, Object O)
        System.out.println("List");
        List<Integer> ll = new ArrayList<>();
        ll.add(0, 10);
        ll.add(1, 20);
        ll.add(2, 30);

        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.remove(0));
        ll.clear();
        System.out.println(ll);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);
    

        System.out.println(l2);
        System.out.println(l2.get(0));
        System.out.println(l2.remove(0));
        ll.clear();
        System.out.println(ll);


        // HashMap
        System.out.println("Hash Map");
        
        // Adding values to HashMap as ("keys", "values") 
        HashMap<String, String> city = new HashMap<>();
        city.put("CA", "San Jose");
        city.put("OH", "Columbus");

        System.out.println(city);
        System.out.println(city.get("CA"));
        for(String i : city.keySet()){
            System.out.println("Key State: " + i + " value City: " + city.get(i));
        }
        
        for(String i : city.values()){
            System.out.println(i);
        }

        if(city.containsKey("OH")){
            String a = city.get("OH");
            System.out.println("The city of OH: " + a);
        }
        displayHashMap(city);


    

    }

public static void displayHashMap(Map<String, String> map){
    System.out.println("displayHashMap method starts");
    if(map.isEmpty()){
        System.out.println("The hashmap is emplty");
    }
    else{
        System.out.println(map);
    }
    System.out.println("displayHashMap method ends");

}
}