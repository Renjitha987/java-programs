class Base {
    private int i;

    public void seti(int a) {
        i = a;
        System.out.println("value of i is set to " + i);
    }

    public int geti() {
        System.out.println(
                "the current value of i is " + i + " and it is returned"
        );
        return i;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
        super.finalize();
    }
}

class Derived extends Base {
    private int j;

    public void setj(int a) {
        j = a;
        System.out.println("value of j is set to " + j);
    }

    public int getj() {
        System.out.println(
                "the current value of j is " + j + " and it is returned"
        );
        return j;
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        // Working with Base class object
        System.out.println("working with base class object");

        Base objB = new Base();

        objB.seti(10);

        int valueI = objB.geti();
        System.out.println(
                "the current value of i is received in main as -> " + valueI
        );

        // Uncomment to make objB eligible for garbage collection
        // objB = null;
        // System.gc();

        System.out.println();

        // Working with Derived class object
        System.out.println("working with derived class object");

        Derived objD = new Derived();

        // Inherited methods from Base
        objD.seti(20);

        int derivedI = objD.geti();
        System.out.println(
                "the current value of i is received in main as -> " + derivedI
        );

        System.out.println();

        // Methods belonging to Derived
        objD.setj(30);

        int valueJ = objD.getj();
        System.out.println(
                "the current value of j is received in main as -> " + valueJ
        );
    }
}