/*
1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
Expected Output :
Hello
Alexandra Abramov

 */

public class printHello {

    public static void main(String[] args) {
        String message = getMessage();
        System.out.println(message);
    }

    public static String getMessage(){
        return "Hello";
    }
}
