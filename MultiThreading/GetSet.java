package MultiThreading;

//import java.util.*;

class Test extends Thread{

}
public class GetSet {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println();
        Test t= new Test();
        t.setName("shivansh ");
        System.out.println();
        System.out.println(t.getName());
        Test t1= new Test();
        t1.setName("Rocks!!");
        System.out.println();
         System.out.println(t1.getName());
    }
}
