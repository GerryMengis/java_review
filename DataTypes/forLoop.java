package DataTypes;

public class forLoop {
    public static void main(String[] args) {
    
        for(int i = 0; i < 5; i++){
            System.out.print(i + " ");
        }
        System.out.println("-----------------------------");
        
        for(int i = 0; i < 5; i++){
            System.out.print(i + " ");
            for(int j = 5; j > 0; j--){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n");
    }
    
}