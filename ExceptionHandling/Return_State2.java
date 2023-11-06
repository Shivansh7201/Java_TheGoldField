//import java.util.*;

public class Return_State2{

public static void main(String[]args){

try{
System.out.println("I'm Excecuted First!!!");
System.out.println(100/0);
}
catch(Exception e){

System.out.println("When Exception Occurs I'm Excecuted First!!!");
return;
}
finally{
System.out.println("BEFORE RETURNING I'm Excecuted First!!!");
}
System.out.println("I'm Excecuted Last!!!");
}
}