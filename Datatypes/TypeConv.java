//import java.util.*;

// When One type of data is assigned to another type of Variable, 
// An AUTOMATIC type Conversion will take place if the following two // conditions are met;

// 1) The Two type are Compatible.
// 2) The destination type is larger that the Source type.

public class TypeConv{

public static void main(String[]args){

byte b;
int i=257;
double d= 323.142;

System.out.println("\nConversion of int to byte.");
b=(byte)i;
System.out.println("i and b " + i + " " + b);
System.out.println();


System.out.println("\nConversion of double to int.");
i=(int)d;
System.out.println("d and i " + d +" " + i);

System.out.println("\nConversion of double to byte.");
b=(byte)d;
System.out.println("d and b" + d + " " + b);

}
}
