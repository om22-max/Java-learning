#COMPONENTS OF JAVA PROGRAMS

1.DOCUMENTATION SECTION (isme ham program ke bare me kuch bhi samjhne ke liye likh sakte hai comments ke andar)
it is written inside  comments .These comments are ignored by th compiler.they are mainly used for understanding and maintaining the program.
        EXAMPLE;
// This is simple program
int age = 20;

2.PACKAGE STATEMENT (java me package ek folder ki trah hota hai jisme ham related classes ko rakh sakte hai)
it is used to specify which package to which  class,interface or other java file belong to.
EXAMPLE;
package student;
Student class belongs to the student package.

        3.IMPORT STATEMENT (isko ham  use karte hai taki ham use ya acess kar paye class , interface or dusre package ko java programs me.)
it is used to acess or used class,interface or other types from another package in java program.

4.INTERFACE STATEMENT

5.CLASS DEFINITIONS (YE EK BLUE PRINT HOTA HAI JISKA USED HAM OBJECTS KO BNANE KE LIYE KARTE HAI)
A class is a blurprint or template for creating objects in java .
it is entery point of java programs.


#VARIABLES IN JAVA

we have some rules to follow while writing a java program .the set of rules is called syntax. like we follow (grammer) some rules while speak English .

VARIABLES = Variable is a container that store values. the value can be change during execution time in the program .

#EXAMPLE OF VARIABLE
int number = 10

int = data type
number = variable
10 = value that store

#RULES OF WRITING VARIABLES

1. A variable can't start  with a digit or number. EXAMPLE

void main () {
    String om = "om";
    String 1Om = "Rathore";
    System.out.println(om);
    System.out.println(Om);
}

2.Name case is sensitive Om or om are different . EXAMPLE

void main () {
    String om = "om";
    String 1Om = "Rathore";
    System.out.println(om);
    System.out.println(Om);
}

3.White spaces are not allowed in java . EXAMPLE

void main () {
    String om = "om";
    String i am Om = "Rathore";

    System.out.println(om);
    System.out.println(Om);
}

4.we can contain alphabtes,characters, doller sign($), undercore (_) in our variable. EXAMPLE

class Main {
    public static void main(String[] args) {
        String om22$_om = "om";
        System.out.println(om22$_om);
    }
}



#DATA  TYPES IN JAVA.

there are 2 types od data types.

        1.PRIMITIVE DATA TYPES

1.byte
it store small whole number,
value range from -128 to 127     (byte formula in copy last page)
it takes 1 byte
default value is 0

        2.short
it store small whole numbers
it range from
it take 2 bytes
default value is 0

        3. int
it store whole numbers
it range from
take 4 byte

4.float
it store decimal number
value range from
take 4 byte
default value is 0.01

        5.long
it store large whole numbers
value range from
it take 8 byte

6.double
it store big decimal number
take 8 bytes
value ranga from
default value is 0.001

        7.char
it store characters
value ranga from
take 2 byte

8.boolean
it represent True or False.
size depends on JVM.
Default value is False

#Write a program for sum of three numbers (EXERCISE1)

class Main {
    public static void main (String[] args) {
        System.out.print("sum of these numbers :  ");
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int sum = num1 + num2 + num3;
        System.out.print(sum);
    }
}
