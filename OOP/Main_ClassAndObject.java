package OOP;

public class Main_ClassAndObject {

    public static void main(String[] args) {

        Class_A obj_A = new Class_A();
        Class_A.staticMethod();
        obj_A.publicMethod();
        obj_A.finalMethod();

    }
}

class Class_A{

    static void staticMethod() {
        System.out.println("this is static class method");
    }

    public void publicMethod(){
        System.out.println("this is public class method");
        
    }
    final void finalMethod() {
        System.out.println("this is final class method");
    }

}

class Class_B{
    //class B

}
