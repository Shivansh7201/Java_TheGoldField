package MultiThreading;


class Test extends Thread{
    public void start(){
        super.start();
    System.out.println("System Method");

}
public void run(){
    System.out.println("Run Method");
}
}
public class ThreadEx {

    public static void main(String[] args) {
        Test t=new Test();
        t.start();
        System.out.println("main Method");
    }
}
