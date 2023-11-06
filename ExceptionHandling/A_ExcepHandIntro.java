//****************(" EXCEPTION HANDLING ")****************
// ************************(" Errors ")**************
//1) SYNTAX ERRORS :-             2)Logical Errors:-                        3)Runtime errors:-
// int a,b;                   if a programmer not give the expected           Mishandling of the program by giving
// sout(a,b)                  outpur while compiling but syntax wise it      wrong and unexpected input by the USER in the
// With the helps                      is correct.                                USER End.
// **to remove through COMPILER.**    ** TO remove it Debbegr HELPS us.**     ** BAdinput and unaviability of RESOURCES**
//                                                                              ( Suppose the user running a car made by a company)        
//                                                                                  and all the functionality is going good,but user not fill the fule its USER FAULTS!!!)
//(NOTE):-By PROVIND The guidance or Solution over the Runtime errors to USER for making correct the USER MISTAKE THis thing DONE BY the programmer.

// Exceptions are Tools to runtime errors and TO HAndle these We Do Exception Handling.
//// Any unwanted (event) or change occur that distrubs the runtime /or/
// dynamically flow of our program or  colde and change he output and Distrub
// it is called EXCEPTION.

//EXAMPLE :- Online meeting is going on and suddenly server lost or connection lost.


//import java.util.*;

public class A_ExcepHandIntro{

public static void main(String[]args){

    int a=10;
    int b=0;
    System.out.println(a/b);  //Exception Occur
    System.out.println("This will Excecute After the Exception Occur That is we want!!!");//That's why there is a need of ExCEPTION HANDLING CONCEPT to run our programs else part when Exception occur instead of Run abnormally
}
}