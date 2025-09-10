class parent {
    void f1() {
        System.out.println("Parent Class");
    }
}

class child extends parent {
    void f2() {
        System.out.println("Child Class");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.f1(); 
        obj.f2(); 
    }
}
