package TypeCasting;

public class Child extends Parent {

    int id = 101;

    void m2() {
        System.out.println("Method from Child Class");
    }

    public static void main(String args[]) {
        Child c = new Child();
        System.out.println(c.name); // Parent
        c.m1(); // Parent
        System.out.println(c.id); // Child
        c.m2(); // Child

        // UpCasting
        // Only Parent p will access the all the thing from Parent Only
        Parent p = new Child(); // Reference is of Parent and object is of Child

        System.out.println(p.name);
        p.m1();

        // p only can have access only Parent not Child
        // System.out.println(p.id); we cannot access
        // p.m2(); we cannot access

        // DownCasting
        System.out.println("-----DownCasting-----");
        Parent p1 = new Parent();
        Child c1 = (Child) p;

        System.out.println((c1.name));
        c1.m1();
        System.out.println(c1.id);
        c1.m2();
    }

}
