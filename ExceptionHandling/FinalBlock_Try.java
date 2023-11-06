public class FinalBlock_Try {
    public static void main(String[] args) {
        try{
            System.out.println("Line 1 of outer try");
            System.out.println(10/0);
            
        try{
            System.out.println("Line 3 of Inner try");
            System.out.println("Line 4 of Inner try");
        }
        catch(Exception e){
            System.out.println("Line 5 of Inner try");
        }finally{
            System.out.println("Line 6 of Inner Finally");
        }
    }
        catch(Exception e){
            System.out.println("Line 7 of outer Catch");
        }finally{
            System.out.println("Line 8 of outer Finally");
        }
}
}
