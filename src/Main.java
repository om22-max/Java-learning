4th_day_LITERAL IN JAVA

LITERAL IN JAVA

Primitive data types  are divided into 4 parts.
In order we choose the data type ,

        1st we need to find the type of data we want to store.
2nd  we need to analyze  the minimum and maximum value we meight use. EXAMPLE

public class Main {
    public static void main (String[] args) {
        int members = 1150 ;                     //int literal
        byte age = 75 ;                          //byte literal
        String name = "om" ;                     //string literal
        boolean passed = true;                   //Boolean literal
        System.out.print(members);
        System.out.print(age);
        System.out.print(name);
        System.out.print(passed);
    }
}

EXAMPLE 2

public class Main {
    public static void main(String[] args) {
        int num = 111112222;
        byte num2 = 111;
        short num3 = 1111;
        long num4 = 11112222l;  //(L or l its by default)
        char letter = 'A';
        float num5 = 0.2f;    //(F or f add  because its not by default)
        double num6 = 0.2025D; //(d or D its by default)
        boolean num7 = true;
        System.out.println(num);
        System.out.println(num5);
    }
}


1. integral (int)
byte
int
short
long (L or l represent)

2.float (decimal number)
float (F OR f represent)
double (D or d represent )

3.char
char ('') characters is written always inside single quotes.

        4.boolean
        (true /false)

KEYWORDS IN JAVA

keywwords are reserved words in java that cannot be used as a variable,class or functions in a java program .
They are show in highlights colour in IntelliJ idea.
Java ne kuch words apne liye reserve kar rakhe hain. Tum unhe variable ya class ka naam nahi bana sakte.
        if see all keywords ,we can search keywords in java oracle.com  EXAMPLE

public class Main {
    public static void main(String[] args) {
        int age = 20;
    }
}
