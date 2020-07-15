package DataTypes;

import java.util.Scanner;

class DataTypes {


    public static void main(String[] args) {

        final int x = 10;
        int v = 20;
        double y = 3.14;
        float z = 13.75623f;
        char c = 'A';
        String str = "String";

        System.out.println((x + v) + y + z + c);
        System.out.println(str);

        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = userinput.nextLine();
        System.out.println("your name is: " + name);
        userinput.close();

    }
    
}