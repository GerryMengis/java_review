package OOP;

class A{
    int a;
    void methodA(){
        // System.out.println("This is class A: " + a);
    }
}
// Single inheritance
// class B inherts class A
// It means can access method A 
// But class A can't access method B or C or D or E
class B extends A{

    void methodB(int num){
        a = num;
        System.out.println("This is class B: " + a);
    }
    @Override
    void methodA(){
        System.out.println("This is class A: " + a);
    }
}
// Multi-inheritance
// class C inherts class B
// It means it can access method B 
// But class B can't access method C
class C extends B{
    void methodC(){
        System.out.println("This is class C: " + a);
    }
}
// Hierarchy inheritance 
// class D & E inherts from class A 
// class D & E has no relationship
class D extends A{
    void methodD(){
        System.out.println("This is class D: " + a);
    }

}

 class E extends A{
    void methodE(){
        System.out.println("This is class E: " + a);
    }
 }


public class Inheritance {
    public static void main(String[] args) {
        B objB = new B();
        objB.methodA();
        objB.methodB(10);
        // objB.methodC();//can't access by class B
        objB.methodA();//value of a updated

        C objC = new C();
        objC.methodB(20);
        objC.methodC();
        objC.methodA();//value of A updated again

        D objD = new D();
        objD.methodA();
        objD.methodD();

        E objE = new E();
        objE.methodA();
        objE.methodE();
    }
    
}