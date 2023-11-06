public class Nestedtry2 {

    public static void main(String[] args) {
        try{
            System.out.println("Try 1 Outer");
            System.out.println("Try 2 Outer");

        try{
            System.out.println("Try 3 Inner");
            System.out.println(5/0); //Exception Occurs
        
    }
    catch(NullPointerException e){
            System.out.println("catch 1 Inner");
        }
         System.out.println("Try 3 Outer");
        }
        catch(Exception e){
        System.out.println("Catch 2 Outer");
    }
    }
    
}
// Whenever Inner Catch cannot handle the Exception of Inner Try Then The Outer catch handle the EXCEPTION 