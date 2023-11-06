package MultiThreading;
class ThreadExample1 extends Thread{
     
}
class  ThreadExample{
public static void main(String[] args){
    ThreadExample1 t = new ThreadExample1();
    t.start();
System.out.println("Main thread is running ");
System.out.println();
System.out.println("Here only one thread is created");
}
}