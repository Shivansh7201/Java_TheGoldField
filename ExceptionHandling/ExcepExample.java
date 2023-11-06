//************(" Find the Exception producing PLACE ???")******

//import java.util.*;

public class ExcepExample{

public static void main(String[]args){

try{

System.out.println("I'm first that will Excecute !!!");
System.out.println();
System.out.println(200/0);
System.out.println("MAy be I will Excecute !!!");
}
catch(Exception d){

System.out.println(300/0); //Exception Occurs Here 

}
System.out.println("If all thing Excecuted then i will Excecute !!!");
}
}
