public class Throw_withlocal extends Throwable {
    public static void main(String[] args) {
        try{
//          throw new Throw_withlocal("Let's,See it will EXCECUTE!!!"); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
                                                                    //  The constructor Throw_withlocal(String) is undefined
    System.out.println(10/0);
        }catch(Exception e){
            System.out.println("\n ERROR FOUND IN MY HOMEGROUND,\n PLEASE HELP TO FIX !!!");
        }
    }
public static void m1(int age){

    if(age<18){
        throw new ArithmeticException("NOT ALIGIBLE FOR VOTING!!!");

    }else{
        System.out.println("NOW YOU ARE ABLE FOR VOTING!!!");
    }
//public static void main(){
  //  m1(12);
  //} 

    }
}




