//import java.util.*;

public class Nested_Try_Catch{

public static void main(String[]args){

try{

System.out.println("Try output");
System.out.println();
System.out.println("Try output");
try{
System.out.println("Try Input");
System.out.println("Try Input");
}
catch(Exception e){
System.out.println("Catch output");
}
System.out.println("Try output");
}
catch(Exception s){
System.out.println("Catch output");
}
}
}



