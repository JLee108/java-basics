/*
1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
Expected Output :
Hello
Alexandra Abramov

 */

public class printHello {

    public static void main(String[] args) {
        String message = getMessage();
        String secondMessage = getSecondMessage();

        System.out.println(message);
        System.out.println(secondMessage);
    }

    public static String getMessage() {
        return "Hello";
    }

    public static String getSecondMessage() {
        return "Jag";
    }
}
