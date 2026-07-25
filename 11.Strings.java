public class StringsExample {

    public static void main(String[] args) {

        String name = "Mishkat";

        System.out.println("String: " + name);

        // String length
        System.out.println("Length: " + name.length());

        // Convert uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Character at index
        System.out.println("First character: " + name.charAt(0));

        // Compare strings
        String another = "Mishkat";

        System.out.println(name.equals(another));
    }
}