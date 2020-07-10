package DataTypes;

public class switchCase {
    
public static void main(String[] args) {
    int day = 8;
    String name = null;

    switch(day){
        case 1:
            name = "Monday";
            break;
        case 2:
            name = "Tuesday";
            break;
        case 3:
            name = "Wed";
            break;
        case 4:
            name = "Thurday";
            break;
        case 5:
            name = "Friday";
            break;

        default:
            System.out.println("EXIT");
 
    }
    System.out.println(name);
}
}