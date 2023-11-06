public class Nest_Try_Catch {
    public static void main(String[] args) {
        try{
            System.out.println("Line 1 of Outer try");
            System.out.println("Line 2 of Outer try");
        try{
            System.out.println("Line 3 of Inner try");
            System.out.println("Line 4 of Inner try");
        }    
        catch(Exception e){
            System.out.println("Line 5 of Catch"); // Exception Not Occur In Inner Try So this will not Excecute
        }finally{
            System.out.println("Line 6 of Finally");
        }
        System.out.println("Line  7 Outer try ");
        }
        catch(Exception e){
            System.out.println("Line 8 Of Outer Catch"); // Exception Not Occur In Inner Try So this will not Excecute
        }
        finally{
            System.out.println("Line of Outer Finally");
        }
   
 }
}


