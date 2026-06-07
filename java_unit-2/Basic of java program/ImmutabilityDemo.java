public class ImmutabilityDemo {
    public static void main(String[] args) {
        // String: immutable
        String s = "Hello";
        System.out.println("suraj gupta");
        s.concat(" World"); // not assigned
        System.out.println("String after concat: " + s);   // Hello

        // StringBuffer: mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" IT world introduce.");
        System.out.println("StringBuffer after append: " + sb); // Hello World
    }
}
