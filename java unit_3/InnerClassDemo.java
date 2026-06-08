class Outer {
    static int outerStatic = 100;
    int outerInstance = 220;

    // Static nested class
    static class StaticNested {
        void show() {
            System.out.println("Static nested: " + outerStatic);
            // Cannot access outerInstance
        }
    }

    // Inner class (non-static)
    class Inner {
        void show() {
            System.out.println("Inner: static=" + outerStatic + ", instance=" + outerInstance);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        System.out.println("SURAJ GUPTA");
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.show();

        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.show();
    }
}