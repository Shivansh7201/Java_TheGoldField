package MultiThreading;

//import java.util.*;

class Test implements Runnable{
public void run(){
    for(int i=1; i<=5;i++){
        System.out.println("Child Thread");
    }
}
}
public class type2_changes {
    public static void main(String[] args) {
    Test t=new Test();
    Thread obj1 =new Thread();
    Thread obj=new Thread(t);
    obj.start(); // here two thread created but Excecuted the Start class inner run having empty def
   // t.start(); error bcoz start test class mein present nhi hai.
    for(int i=1; i<=5;i++){
        System.out.println("Main Thread");
    }
}
}

