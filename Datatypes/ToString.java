//*********(" Handle The Exception BY USING(E.toString() ")***********

//import java.util.*;

public class ToString{

public static void main(String[]args){

try{

System.out.println("I'm Excecute First !!!");
System.out.println();
System.out.println(200/0);  // EXCEPTION OCCURS 

}

catch(Exception s){

System.out.println(s.toString());

}
}
}

// ONLY PRINTS THE Reason over the EXCEPTION Occurs