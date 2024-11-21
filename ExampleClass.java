public class ExampleClass {

    // Instance variable
    private int value;

    // Constructor
    public ExampleClass(int value) {
        this.value = value;
        System.out.println("Constructor called. Value initialized to: " + this.value);
    }

    // Non-static method
    public void displayValue() {
        System.out.println("The current value is: " + value);
    }

    // Static method 1
    public static void staticMethodOne() {
        System.out.println("This is the first static method.");
    }

    // Static method 2
    public static void staticMethodTwo() {
        System.out.println("This is the second static method.");
    }

    public static void main(String[] args) {
        // Calling static methods
        ExampleClass.staticMethodOne();
        ExampleClass.staticMethodTwo();

        // Creating an instance of ExampleClass using the constructor
        ExampleClass example = new ExampleClass(10);

        // Calling the non-static method
        example.displayValue();
    }
}