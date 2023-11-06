//*************(" RETURN STATEMENT IN TRY && CATCH ") *********************

//import java.util.*;

public class Return_State{

public static void main(String[]args){

try{
System.out.println("I'm Excecuted First!!!");
return;
}
catch(Exception e){
System.out.println("When Exception Is Occur I'm Excecuted First!!!");

}
finally{
System.out.println();
System.out.println("I'm Excecuted First!!! BEFORE RETURNING ");
}
}
}


