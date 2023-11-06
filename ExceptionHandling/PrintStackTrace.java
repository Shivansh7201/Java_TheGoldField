// *************(   " Methods To Print Message of Exceptions ")************
                                   //
//(e.printStackTrace())        (e.toString())           (e.getmessage())

//import java.util.*;

public class PrintStackTrace{

public static void main(String[]args){

try{
System.out.println("I'm first Excecute !!!");
System.out.println();
System.out.println(100/0);  //EXCEPTION Occurs

}

catch(Exception s){

s.printStackTrace();

}
}
}                         