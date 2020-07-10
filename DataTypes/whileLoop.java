package DataTypes;

public class whileLoop {
    public static void main(String[] args) {
        int x = 0;
        while(x < 5){
            System.out.println(x);
            x++;

        }
        System.out.println(x);
 
        x = 6;
        do{
            System.out.println(x);
            x++;
        }while(x < 10);
    }
}