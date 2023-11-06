//import java.util.*;

class Throw2{ 

public static void main(String args[]){
try{
ArithmeticException e=new ArithmeticException("Welcome java class");
throw e;
}

catch(ArithmeticException a){
System.out.println(a);
//System.out.println(a.getmessage()); //PTA NHI KYUN AA RHA HAI ERROR
}
}
}

///Always use Throwable and Exception class while using(THROW )keyword in our class  