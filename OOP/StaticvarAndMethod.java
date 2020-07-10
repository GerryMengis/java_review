package OOP;

class Practice{
    static int staticcounter;
    int instancecounter;

    void counter(){
        staticcounter++;
        instancecounter++;
    }

    void displayCount(){
        System.out.println("StaticCounter : " + staticcounter);
        System.out.println("instance counter : " + instancecounter);
    }

    static void staticMethod(){
        System.out.println("Static counter : " + staticcounter);
        // System.out.println("instance counter : " + instancecounter); 
        //only allowed to access static class variable 
        // i.e. instancecounter is non-static instance variable
    }

    void regilarMethod(){
        System.out.println("instance counter : " + instancecounter);
        System.out.println("Static counter : " + staticcounter);
    }
}
public class StaticVarAndMethod {
    public static void main(String[] args) {
        Practice r1 = new Practice();
        Practice r2 = new Practice();
        Practice r3 = new Practice();
        r1.counter();
        r2.counter();
        r3.counter();
        r3.displayCount();

        // static and regular method
        Practice.staticMethod();
        r3.regilarMethod();
    }
    
}