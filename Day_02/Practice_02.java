/*
Keywords in java:
1. abstract: It is a non-access modifier applicable for classes and methods. It is used to achieve abstraction in Java. An abstract class can't be instantiated, and it needs subclasses to provide implementations for its abstract methods. An abstract method is a method without a body.
2. assert: It is used for debugging purposes. It is used to check the correctness of the program's assumptions. If the assertion is false, an error is thrown.
3. boolean: It is a data type that can only store true and false values.
4. break: It is used to terminate a loop or switch statement.
5. byte: It is a data type that can store whole numbers from -128 to 127.
6. case: It is used in switch statements to specify different code blocks.
7. catch: It is used to handle exceptions in Java.
8. char: It is a data type that can store a single character.
9. class: It is used to declare a class in Java.
10. continue: It is used to skip the current iteration of a loop.
11. default: It is used in switch statements to specify the default code block.
12. do: It is used to create a do-while loop.
13. double: It is a data type that can store decimal numbers.
14. else: It is used to specify the code block to be executed if the condition in an if statement is false.
15. enum: It is used to define a fixed set of constants.
16. extends: It is used to inherit from a class.
17. final: It is a non-access modifier applicable for classes, methods, and variables. It is used to restrict the inheritance, overriding, and modification of a class, method, or
variable, respectively.
18. finally: It is used to create a block of code that follows a try block. The finally block is executed after the try block and any catch block.
19. float: It is a data type that can store decimal numbers.
20. for: It is used to create a for loop.
21. if: It is used to create an if statement.
22. implements: It is used to implement an interface.
23. import: It is used to import classes from other packages.
24. instanceof: It is used to test if an object is an instance of a class.
25. int: It is a data type that can store whole numbers.
26. interface: It is used to declare an interface in Java.
27. long: It is a data type that can store large whole numbers.
28. native: It is a non-access modifier applicable for methods. It is used to specify that a method is implemented in native code using JNI (Java Native Interface).
29. new: It is used to create new objects.
30. null: It is used to indicate that a reference variable does not refer to any object.
31. package: It is used to declare a package in Java.
32. private: It is an access modifier applicable for classes, methods, and variables. It is used to restrict the access of a class, method, or variable.
33. protected: It is an access modifier applicable for classes, methods, and variables. It is used to restrict the access of a class, method, or variable to its subclasses and classes in the same package.
34. public: It is an access modifier applicable for classes, methods, and variables. It is used to make a class, method, or
variable accessible from any other class.
35. return: It is used to return a value from a method.
36. short: It is a data type that can store whole numbers from -32,768 to 32,767.
37. static: It is a non-access modifier applicable for classes, methods, and variables. It is used to make a class, method, or
variable belong to the class rather than instances of the class.
38. strictfp: It is a non-access modifier applicable for classes and methods. It restricts floating-point calculations to ensure portability.
39. super: It is used to refer to the superclass of a class.
40. switch: It is used to create a switch statement.
41. synchronized: It is used to create a synchronized block of code.
42. this: It is used to refer to the current object.
43. throw: It is used to throw an exception.
44. throws: It is used to declare exceptions that a method can throw.
45. transient: It is a non-access modifier applicable for variables. It is used to indicate that a variable should not be serialized.
46. try: It is used to create a try block of code that can throw exceptions.
47. void: It is used to specify that a method does not return a value.
48. volatile: It is a non-access modifier applicable for variables. It indicates that a variable may be changed unexpectedly by other parts of the program.
49. while: It is used to create a while loop.
50. strictfp: It is a non-access modifier applicable for classes and methods. It restricts floating-point calculations to ensure portability.

 */

import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        int num =10, num2 = 20;
        if (num > num2) {
            System.out.println("num is greater than num2");
        } else {
            System.out.println("num is less than num2");
            
        }
        // logical operators: &&, ||, !
        // && -> and
        // || -> or
        // ! -> not
        if (num > num2 && num2 > 0) {
            System.out.println("num is greater than num2 and num2 is greater than 0");
        } else {
            System.out.println("num is less than num2 and num2 is less than 0");
        }
        if (num > num2 || num2 > 0) {
            System.out.println("num is greater than num2 or num2 is greater than 0");
        } else {
            System.out.println("num is less than num2 or num2 is less than 0");
        }
        if (!(num > num2)) {
            System.out.println("num is not greater than num2");
        } else {
            System.out.println("num is greater than num2");
        }
        // ternary operator
        // variable = (condition) ? expressionTrue : expressionFalse;
        int result = (num > num2) ? num : num2;
        System.out.println("Result: " + result);
        // switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        // while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Value of i: " + i);
            i++;
        }
        // do-while loop
        int j = 1;
        do {
            System.out.println("Value of j: " + j);
            j++;
        } while (j <= 5);
        // for loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("Value of k: " + k);
        }
        // break statement
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                break;
            }
            System.out.println("Value of l: " + l);
        }
        // continue statement
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println("Value of m: " + m);
        }
        // nested loop
        for (int n = 1; n <= 3; n++) {
            for (int o = 1; o <= 3; o++) {
                System.out.println("Value of n: " + n + " Value of o: " + o);
            }
        }
        // infinite loop
        // while (true) {
        //     System.out.println("Infinite loop");
        // }

        // Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = sc.nextInt();
        System.out.println("Entered number is: " + p);
        sc.close();
        
    }
}
