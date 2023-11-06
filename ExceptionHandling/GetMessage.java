// ****************( " Exception Handling BY E.getMessage() ")******

//import java.util.*;

public class GetMessage{

public static void main(String[]args){

try{

System.out.println("I'm first Excecute !!!");
System.out.println();
System.out.println(400/0);
}
catch(Exception s){
System.out.println(s.getMessage());

}
}
}

//ONLY GIVE THE STATEMENT ABOUT EXCEPTION