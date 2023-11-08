class Test extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child THread");
            Thread.yield(); // this method stops or pause the  Excecution of child and continue after the main thread 
        }
    }
}
class PriorityPauseYieldMethod{
    public static void main(String[] args) {
        Test t2=new Test();
        t2.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
            
        }
        

    }
}
// Task Schedular responsible or Sets the pause timing of every thread