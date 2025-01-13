/*
Java Program Structure
A Java program is a collection of classes, methods, variables, and statements. Let's break down the structure of a simple Java program: Practice_01.java.

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is widely used for building enterprise-scale applications, mobile applications, web applications, and more. Here are some key concepts and features of Java:

Platform Independence: Java code is compiled into bytecode, which can run on any device equipped with a Java Virtual Machine (JVM). This makes Java platform-independent, often summarized by the phrase "write once, run anywhere."

Object-Oriented: Java is an object-oriented programming (OOP) language, which means it uses objects and classes to structure the code. This promotes code reuse and modularity.

Simple and Familiar: Java's syntax is similar to C++, making it easier for developers familiar with C-style languages to learn. However, Java removes many complex features of C++ like pointers and multiple inheritance.

Robust and Secure: Java emphasizes early checking for possible errors, as well as runtime checking. It also has strong memory management and exception handling features. Java's security features are designed to reduce the risk of vulnerabilities.

Multithreaded: Java supports multithreading, which allows concurrent execution of two or more threads. This is useful for performing multiple tasks simultaneously within a program.

Automatic Memory Management: Java uses an automatic garbage collection mechanism to manage memory, which helps in avoiding memory leaks and other related issues.

Rich Standard Library: Java comes with a comprehensive standard library that provides many useful utilities and frameworks for tasks such as data structures, networking, file I/O, and more.

Here is a simple example of a Java program:
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
In this example:

public class HelloWorld: Declares a public class named HelloWorld.
public static void main(String[] args): Declares the main method, which is the entry point of the program.
System.out.println("Hello, World!");: Prints "Hello, World!" to the console.
This program demonstrates the basic structure of a Java application, including class declaration, the main method, and standard output.

 */


/*
Code Explanation
public class Practice_01 {
* public: This is an access modifier that makes the class accessible from any other class.
* class: This keyword is used to declare a class in Java.
* Practice_01: This is the name of the class. In Java, class names typically start with an uppercase letter.

public static void main(String[] args) {
* public: This access modifier makes the main method accessible from anywhere.
* static: This keyword means that the method belongs to the class, rather than instances of the class. This allows the JVM to call this method without creating an instance of the class.
* void: This indicates that the method does not return any value.
* main: This is the name of the method. It is the entry point of any Java application.
* String[] args: This is an array of String objects. It allows the program to accept command-line arguments.

System.out.println("Hello World!");
* System.out: This is a standard output stream.
* println: This method prints the argument passed to it (in this case, "Hello World!") to the console and then terminates the line.
* These closing braces } mark the end of the main method and the Practice_01 class, respectively.

Summary
This Java program defines a class named Practice_01 with a main method. When executed, it prints the text "Hello World!" to the console. The main method is the entry point of the program, and it uses System.out.println to output the text.
 */

public class Practice_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}