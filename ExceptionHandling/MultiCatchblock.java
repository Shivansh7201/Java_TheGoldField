// We Can Have " MULTIPLE CATCH BLOCK WITH SINGLE TRY "

//import java.util.*;

public class MultiCatchblock{
public static void main(String []args){

try{

System.out.println("I'm Excecute first ");
System.out.println(200/0);
System.out.println("May be I'm Excecute first");

}
catch(NullPointerException e)
{
 System.out.println("When Exception Handled then I will Excecute!!!");
}
catch(ArithmeticException s)
{
System.out.println("When Exception Handled then I will Excecute!!!");

}
}
} 