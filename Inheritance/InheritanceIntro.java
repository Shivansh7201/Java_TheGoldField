package Inheritance;
//*****************************("INHERITANCE IN JAVA ")************************
// Inheritance is one of the Base of OOPS concepts Because it allows the creation of Heriarchical Classifications.

// (IN OTHER WORDS )--> Creation of New entity by adding our new concepts and driving properties from an existing // entity is called inheritance.

// FOR Example:- Iphone 15 is the new model phone that deriving features from Iphone 7-8 also adding it's own Features.

// SIMPLE PROGRAM OF INHERITANCE

//import java.util.*;


class Iphone{

int modelno,price; //Creation of SUPERCLASS

void show_Mp(){

System.out.println("Modelno and price:"+ modelno + " " + price);
}
}

// Create a subclass by Extending class A .

class Iphone15 extends Iphone{

int features;

void showFeatures(){

System.out.println(" Features:"+ features);
}
void finalModel(){

System.out.println(" Modelno + price + Features: " + (modelno + price + features));
}
}

public class InheritanceIntro{
public static void main(String[]args){
 
Iphone xp= new Iphone();
Iphone15 yp= new Iphone15();

//The superclass may be used by itself.

xp.modelno=10;
xp.price=20;
System.out.println();
System.out.println("Contents of Iphone:");
xp.show_Mp();
System.out.println();

/* The Subclass has access to all public members of its superclass. */

yp.modelno=7;
yp.price=8;
yp.features=9;
System.out.println("Contests of Iphone15:");
yp.show_Mp();
yp.showFeatures();
System.out.println();

System.out.println("Sum of Modelno, price and features in YP:");
yp.finalModel();

}
}


 



