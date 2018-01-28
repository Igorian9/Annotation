package ua.i.igor_igorovuich;

public class Something {
    @MyAnnotation(a = 5, b = 2)
    public int myMethod(int a, int b) {
        return a - b;
    }
}
