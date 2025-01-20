package day9.src_day9;

class A{
    void foo(){
        System.out.println("foo of class A");
    }
}
class B extends  A{
    void foo(){
        System.out.println("foo of class B override");
    }
}

class C extends A{
    void foo()
    {
        System.out.println("foo of class C override");
    }
}

class D extends B{
    @Override
    void foo()
    {
        System.out.println("class D overriding all the other classes");
    }
}
public class C_DiamondOp {
    public static void main(String[] args) {
        A a  = new A();
        A b = new B();
        A c = new C();
        D d = new D();
//        a.foo();
//        b.foo();
//        c.foo();
        d.foo();
    }
}