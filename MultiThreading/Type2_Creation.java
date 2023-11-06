package MultiThreading;

//import java.util.*;
class Test implements Runnable{
public void run(){
    for(int i=1; i<=5;i++){
        System.out.println("Child Thread");
    }
}
}
class Type2_Creation{
    public static void main(String[] args) {
    Test t=new Test();
    Thread obj1=new Thread();
    Thread obj=new Thread(t);
    obj.start();
   // t.start(); error bcoz start test class mein present nhi hai.
    for(int i=1; i<=5;i++){
        System.out.println("Main Thread");
    }
}
}

//OUTUPUT :- We can't predict the output sequence it will differ which can handle the thread schedular