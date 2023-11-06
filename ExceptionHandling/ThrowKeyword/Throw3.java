class Throw3 extends Exception{
public static void main(String[] args){
 try{
 throw new ArithmeticException("kalaastaar");
 }
catch(Exception e){
    System.out.println("hello");
}
    }
}
// (NOTE):-What is the difference between Throw and Throws?

// Apni class mein jab use karte hai throw keyword To kuch batein yaad rakho:-

//1) Always extends the Throwable and Exception classes.

// 2)always catch the throw keyword in our class.

//3) Always use constructor to print the message with Exception. 