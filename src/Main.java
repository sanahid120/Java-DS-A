import basic_I_O.Basics;
import java.util.Scanner;

public  class Main{
    public static void main(String[] args){
        Basics basics = new Basics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        basics.printData("Hello " + name);
        System.out.println("Enter your age: ");
        int age1 = scanner.nextInt();
        System.out.println("You are " + age1 + " years old.");

        scanner.close();




        basics.printData("Hello");


        byte age = 25; // byte =1 byte - -127 to 127
        int age6 = 25; // int = 4 byte
        short age2 = 25; // short = 2 byte - -32,768 to 32,767
        long age3 = 25555555L; // long = 8 byte - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float age4 = 25.5f; // float = 4 byte - 1.4e-45 to 3.4e+38
        double age5 = 25.5; // double = 8 byte - 4.9e-324 to 1.8e+308
        

        /* literals are the values assigned to variables like 25, "Hello", true, etc. */

    }
}