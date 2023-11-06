//import java.util.*;

public class ScopeOfvar{

public static void main(String[]args){

int x=10;
if(x==10){
//new scope starts 
int y=20; // known only to this block

//x and y both known here.

System.out.println("x and y :" + x + " " + y);
x=y*2;
}

//y =100; //Error ! y not known here

//x is still known here

System.out.println(" x is " + x);
}
}

// Variables is created when their scope is entered , and Distroyed when their //scope is left.

