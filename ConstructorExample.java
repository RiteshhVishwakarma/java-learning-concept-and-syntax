public class ConstructorExample {
    int a=10,b=20;

//    A constructor
    ConstructorExample(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
    }
}
//Notes:

// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.

//    What are Constructors in Java?
//    In Java, a Constructor is a block of codes similar to the method.
//    It is called when an instance of the class is created. At the time of calling the constructor,
//    memory for the object is allocated in the memory.
//    It is a special type of method that is used to initialize the object.
//    Every time an object is created using the new() keyword, at least one constructor is called.

//    How Java Constructors are Different From Java Methods?
//    Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
//    Constructors do not return any type while method(s) have the return type or void if does not return any value.
//    Constructors are called only once at the time of Object creation while method(s) can be called any number of times.


